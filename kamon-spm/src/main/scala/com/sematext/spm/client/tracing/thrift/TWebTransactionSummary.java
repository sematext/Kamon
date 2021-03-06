/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sematext.spm.client.tracing.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

public class TWebTransactionSummary implements org.apache.thrift.TBase<TWebTransactionSummary, TWebTransactionSummary._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TWebTransactionSummary");

  private static final org.apache.thrift.protocol.TField REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("request", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("queryString", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESPONSE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("responseCode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField REQUEST_METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("requestMethod", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TWebTransactionSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TWebTransactionSummaryTupleSchemeFactory());
  }

  public String request; // optional
  public String queryString; // optional
  public int responseCode; // optional
  public String requestMethod; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST((short)1, "request"),
    QUERY_STRING((short)2, "queryString"),
    RESPONSE_CODE((short)3, "responseCode"),
    REQUEST_METHOD((short)4, "requestMethod");

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
        case 1: // REQUEST
          return REQUEST;
        case 2: // QUERY_STRING
          return QUERY_STRING;
        case 3: // RESPONSE_CODE
          return RESPONSE_CODE;
        case 4: // REQUEST_METHOD
          return REQUEST_METHOD;
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
  private static final int __RESPONSECODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.REQUEST,_Fields.QUERY_STRING,_Fields.RESPONSE_CODE,_Fields.REQUEST_METHOD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST, new org.apache.thrift.meta_data.FieldMetaData("request", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY_STRING, new org.apache.thrift.meta_data.FieldMetaData("queryString", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESPONSE_CODE, new org.apache.thrift.meta_data.FieldMetaData("responseCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUEST_METHOD, new org.apache.thrift.meta_data.FieldMetaData("requestMethod", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TWebTransactionSummary.class, metaDataMap);
  }

  public TWebTransactionSummary() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TWebTransactionSummary(TWebTransactionSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRequest()) {
      this.request = other.request;
    }
    if (other.isSetQueryString()) {
      this.queryString = other.queryString;
    }
    this.responseCode = other.responseCode;
    if (other.isSetRequestMethod()) {
      this.requestMethod = other.requestMethod;
    }
  }

  public TWebTransactionSummary deepCopy() {
    return new TWebTransactionSummary(this);
  }

  @Override
  public void clear() {
    this.request = null;
    this.queryString = null;
    setResponseCodeIsSet(false);
    this.responseCode = 0;
    this.requestMethod = null;
  }

  public String getRequest() {
    return this.request;
  }

  public TWebTransactionSummary setRequest(String request) {
    this.request = request;
    return this;
  }

  public void unsetRequest() {
    this.request = null;
  }

  /** Returns true if field request is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest() {
    return this.request != null;
  }

  public void setRequestIsSet(boolean value) {
    if (!value) {
      this.request = null;
    }
  }

  public String getQueryString() {
    return this.queryString;
  }

  public TWebTransactionSummary setQueryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  public void unsetQueryString() {
    this.queryString = null;
  }

  /** Returns true if field queryString is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryString() {
    return this.queryString != null;
  }

  public void setQueryStringIsSet(boolean value) {
    if (!value) {
      this.queryString = null;
    }
  }

  public int getResponseCode() {
    return this.responseCode;
  }

  public TWebTransactionSummary setResponseCode(int responseCode) {
    this.responseCode = responseCode;
    setResponseCodeIsSet(true);
    return this;
  }

  public void unsetResponseCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESPONSECODE_ISSET_ID);
  }

  /** Returns true if field responseCode is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseCode() {
    return EncodingUtils.testBit(__isset_bitfield, __RESPONSECODE_ISSET_ID);
  }

  public void setResponseCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESPONSECODE_ISSET_ID, value);
  }

  public String getRequestMethod() {
    return this.requestMethod;
  }

  public TWebTransactionSummary setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

  public void unsetRequestMethod() {
    this.requestMethod = null;
  }

  /** Returns true if field requestMethod is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestMethod() {
    return this.requestMethod != null;
  }

  public void setRequestMethodIsSet(boolean value) {
    if (!value) {
      this.requestMethod = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST:
      if (value == null) {
        unsetRequest();
      } else {
        setRequest((String)value);
      }
      break;

    case QUERY_STRING:
      if (value == null) {
        unsetQueryString();
      } else {
        setQueryString((String)value);
      }
      break;

    case RESPONSE_CODE:
      if (value == null) {
        unsetResponseCode();
      } else {
        setResponseCode((Integer)value);
      }
      break;

    case REQUEST_METHOD:
      if (value == null) {
        unsetRequestMethod();
      } else {
        setRequestMethod((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST:
      return getRequest();

    case QUERY_STRING:
      return getQueryString();

    case RESPONSE_CODE:
      return Integer.valueOf(getResponseCode());

    case REQUEST_METHOD:
      return getRequestMethod();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST:
      return isSetRequest();
    case QUERY_STRING:
      return isSetQueryString();
    case RESPONSE_CODE:
      return isSetResponseCode();
    case REQUEST_METHOD:
      return isSetRequestMethod();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TWebTransactionSummary)
      return this.equals((TWebTransactionSummary)that);
    return false;
  }

  public boolean equals(TWebTransactionSummary that) {
    if (that == null)
      return false;

    boolean this_present_request = true && this.isSetRequest();
    boolean that_present_request = true && that.isSetRequest();
    if (this_present_request || that_present_request) {
      if (!(this_present_request && that_present_request))
        return false;
      if (!this.request.equals(that.request))
        return false;
    }

    boolean this_present_queryString = true && this.isSetQueryString();
    boolean that_present_queryString = true && that.isSetQueryString();
    if (this_present_queryString || that_present_queryString) {
      if (!(this_present_queryString && that_present_queryString))
        return false;
      if (!this.queryString.equals(that.queryString))
        return false;
    }

    boolean this_present_responseCode = true && this.isSetResponseCode();
    boolean that_present_responseCode = true && that.isSetResponseCode();
    if (this_present_responseCode || that_present_responseCode) {
      if (!(this_present_responseCode && that_present_responseCode))
        return false;
      if (this.responseCode != that.responseCode)
        return false;
    }

    boolean this_present_requestMethod = true && this.isSetRequestMethod();
    boolean that_present_requestMethod = true && that.isSetRequestMethod();
    if (this_present_requestMethod || that_present_requestMethod) {
      if (!(this_present_requestMethod && that_present_requestMethod))
        return false;
      if (!this.requestMethod.equals(that.requestMethod))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TWebTransactionSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TWebTransactionSummary typedOther = (TWebTransactionSummary)other;

    lastComparison = Boolean.valueOf(isSetRequest()).compareTo(typedOther.isSetRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request, typedOther.request);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryString()).compareTo(typedOther.isSetQueryString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryString, typedOther.queryString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseCode()).compareTo(typedOther.isSetResponseCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseCode, typedOther.responseCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestMethod()).compareTo(typedOther.isSetRequestMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestMethod, typedOther.requestMethod);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TWebTransactionSummary(");
    boolean first = true;

    if (isSetRequest()) {
      sb.append("request:");
      if (this.request == null) {
        sb.append("null");
      } else {
        sb.append(this.request);
      }
      first = false;
    }
    if (isSetQueryString()) {
      if (!first) sb.append(", ");
      sb.append("queryString:");
      if (this.queryString == null) {
        sb.append("null");
      } else {
        sb.append(this.queryString);
      }
      first = false;
    }
    if (isSetResponseCode()) {
      if (!first) sb.append(", ");
      sb.append("responseCode:");
      sb.append(this.responseCode);
      first = false;
    }
    if (isSetRequestMethod()) {
      if (!first) sb.append(", ");
      sb.append("requestMethod:");
      if (this.requestMethod == null) {
        sb.append("null");
      } else {
        sb.append(this.requestMethod);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TWebTransactionSummaryStandardSchemeFactory implements SchemeFactory {
    public TWebTransactionSummaryStandardScheme getScheme() {
      return new TWebTransactionSummaryStandardScheme();
    }
  }

  private static class TWebTransactionSummaryStandardScheme extends StandardScheme<TWebTransactionSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TWebTransactionSummary struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.request = iprot.readString();
              struct.setRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.queryString = iprot.readString();
              struct.setQueryStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESPONSE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.responseCode = iprot.readI32();
              struct.setResponseCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUEST_METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestMethod = iprot.readString();
              struct.setRequestMethodIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TWebTransactionSummary struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.request != null) {
        if (struct.isSetRequest()) {
          oprot.writeFieldBegin(REQUEST_FIELD_DESC);
          oprot.writeString(struct.request);
          oprot.writeFieldEnd();
        }
      }
      if (struct.queryString != null) {
        if (struct.isSetQueryString()) {
          oprot.writeFieldBegin(QUERY_STRING_FIELD_DESC);
          oprot.writeString(struct.queryString);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetResponseCode()) {
        oprot.writeFieldBegin(RESPONSE_CODE_FIELD_DESC);
        oprot.writeI32(struct.responseCode);
        oprot.writeFieldEnd();
      }
      if (struct.requestMethod != null) {
        if (struct.isSetRequestMethod()) {
          oprot.writeFieldBegin(REQUEST_METHOD_FIELD_DESC);
          oprot.writeString(struct.requestMethod);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TWebTransactionSummaryTupleSchemeFactory implements SchemeFactory {
    public TWebTransactionSummaryTupleScheme getScheme() {
      return new TWebTransactionSummaryTupleScheme();
    }
  }

  private static class TWebTransactionSummaryTupleScheme extends TupleScheme<TWebTransactionSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TWebTransactionSummary struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequest()) {
        optionals.set(0);
      }
      if (struct.isSetQueryString()) {
        optionals.set(1);
      }
      if (struct.isSetResponseCode()) {
        optionals.set(2);
      }
      if (struct.isSetRequestMethod()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRequest()) {
        oprot.writeString(struct.request);
      }
      if (struct.isSetQueryString()) {
        oprot.writeString(struct.queryString);
      }
      if (struct.isSetResponseCode()) {
        oprot.writeI32(struct.responseCode);
      }
      if (struct.isSetRequestMethod()) {
        oprot.writeString(struct.requestMethod);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TWebTransactionSummary struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.request = iprot.readString();
        struct.setRequestIsSet(true);
      }
      if (incoming.get(1)) {
        struct.queryString = iprot.readString();
        struct.setQueryStringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.responseCode = iprot.readI32();
        struct.setResponseCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.requestMethod = iprot.readString();
        struct.setRequestMethodIsSet(true);
      }
    }
  }

}

