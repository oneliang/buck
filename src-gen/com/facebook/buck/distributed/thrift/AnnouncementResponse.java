/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-07-18")
public class AnnouncementResponse implements org.apache.thrift.TBase<AnnouncementResponse, AnnouncementResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AnnouncementResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnnouncementResponse");

  private static final org.apache.thrift.protocol.TField ANNOUNCEMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("announcements", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnouncementResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnouncementResponseTupleSchemeFactory());
  }

  public List<Announcement> announcements; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ANNOUNCEMENTS((short)1, "announcements");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ANNOUNCEMENTS
          return ANNOUNCEMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ANNOUNCEMENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOUNCEMENTS, new org.apache.thrift.meta_data.FieldMetaData("announcements", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Announcement.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnnouncementResponse.class, metaDataMap);
  }

  public AnnouncementResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnnouncementResponse(AnnouncementResponse other) {
    if (other.isSetAnnouncements()) {
      List<Announcement> __this__announcements = new ArrayList<Announcement>(other.announcements.size());
      for (Announcement other_element : other.announcements) {
        __this__announcements.add(new Announcement(other_element));
      }
      this.announcements = __this__announcements;
    }
  }

  public AnnouncementResponse deepCopy() {
    return new AnnouncementResponse(this);
  }

  @Override
  public void clear() {
    this.announcements = null;
  }

  public int getAnnouncementsSize() {
    return (this.announcements == null) ? 0 : this.announcements.size();
  }

  public java.util.Iterator<Announcement> getAnnouncementsIterator() {
    return (this.announcements == null) ? null : this.announcements.iterator();
  }

  public void addToAnnouncements(Announcement elem) {
    if (this.announcements == null) {
      this.announcements = new ArrayList<Announcement>();
    }
    this.announcements.add(elem);
  }

  public List<Announcement> getAnnouncements() {
    return this.announcements;
  }

  public AnnouncementResponse setAnnouncements(List<Announcement> announcements) {
    this.announcements = announcements;
    return this;
  }

  public void unsetAnnouncements() {
    this.announcements = null;
  }

  /** Returns true if field announcements is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnouncements() {
    return this.announcements != null;
  }

  public void setAnnouncementsIsSet(boolean value) {
    if (!value) {
      this.announcements = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ANNOUNCEMENTS:
      if (value == null) {
        unsetAnnouncements();
      } else {
        setAnnouncements((List<Announcement>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOUNCEMENTS:
      return getAnnouncements();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ANNOUNCEMENTS:
      return isSetAnnouncements();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnnouncementResponse)
      return this.equals((AnnouncementResponse)that);
    return false;
  }

  public boolean equals(AnnouncementResponse that) {
    if (that == null)
      return false;

    boolean this_present_announcements = true && this.isSetAnnouncements();
    boolean that_present_announcements = true && that.isSetAnnouncements();
    if (this_present_announcements || that_present_announcements) {
      if (!(this_present_announcements && that_present_announcements))
        return false;
      if (!this.announcements.equals(that.announcements))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_announcements = true && (isSetAnnouncements());
    list.add(present_announcements);
    if (present_announcements)
      list.add(announcements);

    return list.hashCode();
  }

  @Override
  public int compareTo(AnnouncementResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAnnouncements()).compareTo(other.isSetAnnouncements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnouncements()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announcements, other.announcements);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AnnouncementResponse(");
    boolean first = true;

    if (isSetAnnouncements()) {
      sb.append("announcements:");
      if (this.announcements == null) {
        sb.append("null");
      } else {
        sb.append(this.announcements);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnnouncementResponseStandardSchemeFactory implements SchemeFactory {
    public AnnouncementResponseStandardScheme getScheme() {
      return new AnnouncementResponseStandardScheme();
    }
  }

  private static class AnnouncementResponseStandardScheme extends StandardScheme<AnnouncementResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOUNCEMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list138 = iprot.readListBegin();
                struct.announcements = new ArrayList<Announcement>(_list138.size);
                Announcement _elem139;
                for (int _i140 = 0; _i140 < _list138.size; ++_i140)
                {
                  _elem139 = new Announcement();
                  _elem139.read(iprot);
                  struct.announcements.add(_elem139);
                }
                iprot.readListEnd();
              }
              struct.setAnnouncementsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.announcements != null) {
        if (struct.isSetAnnouncements()) {
          oprot.writeFieldBegin(ANNOUNCEMENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.announcements.size()));
            for (Announcement _iter141 : struct.announcements)
            {
              _iter141.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnouncementResponseTupleSchemeFactory implements SchemeFactory {
    public AnnouncementResponseTupleScheme getScheme() {
      return new AnnouncementResponseTupleScheme();
    }
  }

  private static class AnnouncementResponseTupleScheme extends TupleScheme<AnnouncementResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAnnouncements()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAnnouncements()) {
        {
          oprot.writeI32(struct.announcements.size());
          for (Announcement _iter142 : struct.announcements)
          {
            _iter142.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list143 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.announcements = new ArrayList<Announcement>(_list143.size);
          Announcement _elem144;
          for (int _i145 = 0; _i145 < _list143.size; ++_i145)
          {
            _elem144 = new Announcement();
            _elem144.read(iprot);
            struct.announcements.add(_elem144);
          }
        }
        struct.setAnnouncementsIsSet(true);
      }
    }
  }

}

