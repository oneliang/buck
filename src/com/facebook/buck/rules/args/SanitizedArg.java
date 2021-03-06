/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.rules.args;

import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.SourcePathResolver;
import com.google.common.collect.ImmutableList;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * An {@link Arg} which must be sanitized before contributing to a {@link
 * com.facebook.buck.rules.RuleKey}.
 *
 * <p>
 *
 * <pre>{@code
 * ImmutableMap<String, String> toolchainRoots =
 *     ImmutableMap.of("/opt/toolchain", "$TOOLCHAIN_ROOT");
 * Path toolchainRoot = Paths.get("/opt/toolchain");
 * Arg arg =
 *     new SanitizedArg(
 *         Functions.forMap(toolchainRoots),
 *         "/opt/toolchain/bin/tool");
 * }</pre>
 */
public class SanitizedArg implements Arg {
  private final String unsanitized;
  @AddToRuleKey private final String sanitized;

  public SanitizedArg(Function<? super String, String> sanitizer, String unsanitized) {
    this.unsanitized = unsanitized;
    this.sanitized = sanitizer.apply(unsanitized);
  }

  @Override
  public void appendToCommandLine(Consumer<String> consumer, SourcePathResolver pathResolver) {
    consumer.accept(unsanitized);
  }

  @Override
  public String toString() {
    return unsanitized;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SanitizedArg)) {
      return false;
    }
    SanitizedArg sanitizedArg = (SanitizedArg) o;
    return Objects.equals(sanitized, sanitizedArg.sanitized)
        && Objects.equals(unsanitized, sanitizedArg.unsanitized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanitized, unsanitized);
  }

  public static ImmutableList<Arg> from(Function<String, String> sanitizer, Iterable<String> args) {
    ImmutableList.Builder<Arg> converted = ImmutableList.builder();
    for (String arg : args) {
      converted.add(new SanitizedArg(sanitizer, arg));
    }
    return converted.build();
  }
}
