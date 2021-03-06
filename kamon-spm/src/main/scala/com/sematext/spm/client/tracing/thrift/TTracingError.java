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
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;

import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

public class TTracingError implements org.apache.thrift.TBase<TTracingError, TTracingError._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTracingError");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traceId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PARENT_CALL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentCallId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CALL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("callId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField SAMPLED_FIELD_DESC = new org.apache.thrift.protocol.TField("sampled", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTracingErrorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTracingErrorTupleSchemeFactory());
  }

  public String token; // required
  public long traceId; // optional
  public long parentCallId; // optional
  public long callId; // optional
  public long timestamp; // required
  public boolean sampled; // required
  public Map<String,String> parameters; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    TRACE_ID((short)2, "traceId"),
    PARENT_CALL_ID((short)3, "parentCallId"),
    CALL_ID((short)4, "callId"),
    TIMESTAMP((short)5, "timestamp"),
    SAMPLED((short)6, "sampled"),
    PARAMETERS((short)7, "parameters");

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
        case 1: // TOKEN
          return TOKEN;
        case 2: // TRACE_ID
          return TRACE_ID;
        case 3: // PARENT_CALL_ID
          return PARENT_CALL_ID;
        case 4: // CALL_ID
          return CALL_ID;
        case 5: // TIMESTAMP
          return TIMESTAMP;
        case 6: // SAMPLED
          return SAMPLED;
        case 7: // PARAMETERS
          return PARAMETERS;
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
  private static final int __TRACEID_ISSET_ID = 0;
  private static final int __PARENTCALLID_ISSET_ID = 1;
  private static final int __CALLID_ISSET_ID = 2;
  private static final int __TIMESTAMP_ISSET_ID = 3;
  private static final int __SAMPLED_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TRACE_ID,_Fields.PARENT_CALL_ID,_Fields.CALL_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("traceId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARENT_CALL_ID, new org.apache.thrift.meta_data.FieldMetaData("parentCallId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CALL_ID, new org.apache.thrift.meta_data.FieldMetaData("callId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SAMPLED, new org.apache.thrift.meta_data.FieldMetaData("sampled", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTracingError.class, metaDataMap);
  }

  public TTracingError() {
  }

  public TTracingError(
    String token,
    long timestamp,
    boolean sampled,
    Map<String,String> parameters)
  {
    this();
    this.token = token;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.sampled = sampled;
    setSampledIsSet(true);
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTracingError(TTracingError other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetToken()) {
      this.token = other.token;
    }
    this.traceId = other.traceId;
    this.parentCallId = other.parentCallId;
    this.callId = other.callId;
    this.timestamp = other.timestamp;
    this.sampled = other.sampled;
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.parameters.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__parameters_copy_key = other_element_key;

        String __this__parameters_copy_value = other_element_value;

        __this__parameters.put(__this__parameters_copy_key, __this__parameters_copy_value);
      }
      this.parameters = __this__parameters;
    }
  }

  public TTracingError deepCopy() {
    return new TTracingError(this);
  }

  @Override
  public void clear() {
    this.token = null;
    setTraceIdIsSet(false);
    this.traceId = 0;
    setParentCallIdIsSet(false);
    this.parentCallId = 0;
    setCallIdIsSet(false);
    this.callId = 0;
    setTimestampIsSet(false);
    this.timestamp = 0;
    setSampledIsSet(false);
    this.sampled = false;
    this.parameters = null;
  }

  public String getToken() {
    return this.token;
  }

  public TTracingError setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public long getTraceId() {
    return this.traceId;
  }

  public TTracingError setTraceId(long traceId) {
    this.traceId = traceId;
    setTraceIdIsSet(true);
    return this;
  }

  public void unsetTraceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRACEID_ISSET_ID);
  }

  /** Returns true if field traceId is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceId() {
    return EncodingUtils.testBit(__isset_bitfield, __TRACEID_ISSET_ID);
  }

  public void setTraceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRACEID_ISSET_ID, value);
  }

  public long getParentCallId() {
    return this.parentCallId;
  }

  public TTracingError setParentCallId(long parentCallId) {
    this.parentCallId = parentCallId;
    setParentCallIdIsSet(true);
    return this;
  }

  public void unsetParentCallId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARENTCALLID_ISSET_ID);
  }

  /** Returns true if field parentCallId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentCallId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARENTCALLID_ISSET_ID);
  }

  public void setParentCallIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARENTCALLID_ISSET_ID, value);
  }

  public long getCallId() {
    return this.callId;
  }

  public TTracingError setCallId(long callId) {
    this.callId = callId;
    setCallIdIsSet(true);
    return this;
  }

  public void unsetCallId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CALLID_ISSET_ID);
  }

  /** Returns true if field callId is set (has been assigned a value) and false otherwise */
  public boolean isSetCallId() {
    return EncodingUtils.testBit(__isset_bitfield, __CALLID_ISSET_ID);
  }

  public void setCallIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CALLID_ISSET_ID, value);
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public TTracingError setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public boolean isSampled() {
    return this.sampled;
  }

  public TTracingError setSampled(boolean sampled) {
    this.sampled = sampled;
    setSampledIsSet(true);
    return this;
  }

  public void unsetSampled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SAMPLED_ISSET_ID);
  }

  /** Returns true if field sampled is set (has been assigned a value) and false otherwise */
  public boolean isSetSampled() {
    return EncodingUtils.testBit(__isset_bitfield, __SAMPLED_ISSET_ID);
  }

  public void setSampledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SAMPLED_ISSET_ID, value);
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public TTracingError setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    case TRACE_ID:
      if (value == null) {
        unsetTraceId();
      } else {
        setTraceId((Long)value);
      }
      break;

    case PARENT_CALL_ID:
      if (value == null) {
        unsetParentCallId();
      } else {
        setParentCallId((Long)value);
      }
      break;

    case CALL_ID:
      if (value == null) {
        unsetCallId();
      } else {
        setCallId((Long)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case SAMPLED:
      if (value == null) {
        unsetSampled();
      } else {
        setSampled((Boolean)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN:
      return getToken();

    case TRACE_ID:
      return Long.valueOf(getTraceId());

    case PARENT_CALL_ID:
      return Long.valueOf(getParentCallId());

    case CALL_ID:
      return Long.valueOf(getCallId());

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case SAMPLED:
      return Boolean.valueOf(isSampled());

    case PARAMETERS:
      return getParameters();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOKEN:
      return isSetToken();
    case TRACE_ID:
      return isSetTraceId();
    case PARENT_CALL_ID:
      return isSetParentCallId();
    case CALL_ID:
      return isSetCallId();
    case TIMESTAMP:
      return isSetTimestamp();
    case SAMPLED:
      return isSetSampled();
    case PARAMETERS:
      return isSetParameters();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTracingError)
      return this.equals((TTracingError)that);
    return false;
  }

  public boolean equals(TTracingError that) {
    if (that == null)
      return false;

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_traceId = true && this.isSetTraceId();
    boolean that_present_traceId = true && that.isSetTraceId();
    if (this_present_traceId || that_present_traceId) {
      if (!(this_present_traceId && that_present_traceId))
        return false;
      if (this.traceId != that.traceId)
        return false;
    }

    boolean this_present_parentCallId = true && this.isSetParentCallId();
    boolean that_present_parentCallId = true && that.isSetParentCallId();
    if (this_present_parentCallId || that_present_parentCallId) {
      if (!(this_present_parentCallId && that_present_parentCallId))
        return false;
      if (this.parentCallId != that.parentCallId)
        return false;
    }

    boolean this_present_callId = true && this.isSetCallId();
    boolean that_present_callId = true && that.isSetCallId();
    if (this_present_callId || that_present_callId) {
      if (!(this_present_callId && that_present_callId))
        return false;
      if (this.callId != that.callId)
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_sampled = true;
    boolean that_present_sampled = true;
    if (this_present_sampled || that_present_sampled) {
      if (!(this_present_sampled && that_present_sampled))
        return false;
      if (this.sampled != that.sampled)
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TTracingError other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TTracingError typedOther = (TTracingError)other;

    lastComparison = Boolean.valueOf(isSetToken()).compareTo(typedOther.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, typedOther.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraceId()).compareTo(typedOther.isSetTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceId, typedOther.traceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentCallId()).compareTo(typedOther.isSetParentCallId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentCallId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentCallId, typedOther.parentCallId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallId()).compareTo(typedOther.isSetCallId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callId, typedOther.callId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSampled()).compareTo(typedOther.isSetSampled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSampled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sampled, typedOther.sampled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(typedOther.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, typedOther.parameters);
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
    StringBuilder sb = new StringBuilder("TTracingError(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (isSetTraceId()) {
      if (!first) sb.append(", ");
      sb.append("traceId:");
      sb.append(this.traceId);
      first = false;
    }
    if (isSetParentCallId()) {
      if (!first) sb.append(", ");
      sb.append("parentCallId:");
      sb.append(this.parentCallId);
      first = false;
    }
    if (isSetCallId()) {
      if (!first) sb.append(", ");
      sb.append("callId:");
      sb.append(this.callId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sampled:");
    sb.append(this.sampled);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (token == null) {
      throw new TProtocolException("Required field 'token' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'sampled' because it's a primitive and you chose the non-beans generator.
    if (parameters == null) {
      throw new TProtocolException("Required field 'parameters' was not present! Struct: " + toString());
    }
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

  private static class TTracingErrorStandardSchemeFactory implements SchemeFactory {
    public TTracingErrorStandardScheme getScheme() {
      return new TTracingErrorStandardScheme();
    }
  }

  private static class TTracingErrorStandardScheme extends StandardScheme<TTracingError> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTracingError struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.traceId = iprot.readI64();
              struct.setTraceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARENT_CALL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.parentCallId = iprot.readI64();
              struct.setParentCallIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CALL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.callId = iprot.readI64();
              struct.setCallIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SAMPLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sampled = iprot.readBool();
              struct.setSampledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map54 = iprot.readMapBegin();
                struct.parameters = new HashMap<String,String>(2*_map54.size);
                for (int _i55 = 0; _i55 < _map54.size; ++_i55)
                {
                  String _key56; // required
                  String _val57; // required
                  _key56 = iprot.readString();
                  _val57 = iprot.readString();
                  struct.parameters.put(_key56, _val57);
                }
                iprot.readMapEnd();
              }
              struct.setParametersIsSet(true);
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
      if (!struct.isSetTimestamp()) {
        throw new TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSampled()) {
        throw new TProtocolException("Required field 'sampled' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTracingError struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTraceId()) {
        oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
        oprot.writeI64(struct.traceId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetParentCallId()) {
        oprot.writeFieldBegin(PARENT_CALL_ID_FIELD_DESC);
        oprot.writeI64(struct.parentCallId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCallId()) {
        oprot.writeFieldBegin(CALL_ID_FIELD_DESC);
        oprot.writeI64(struct.callId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SAMPLED_FIELD_DESC);
      oprot.writeBool(struct.sampled);
      oprot.writeFieldEnd();
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (Map.Entry<String, String> _iter58 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter58.getKey());
            oprot.writeString(_iter58.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTracingErrorTupleSchemeFactory implements SchemeFactory {
    public TTracingErrorTupleScheme getScheme() {
      return new TTracingErrorTupleScheme();
    }
  }

  private static class TTracingErrorTupleScheme extends TupleScheme<TTracingError> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTracingError struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.token);
      oprot.writeI64(struct.timestamp);
      oprot.writeBool(struct.sampled);
      {
        oprot.writeI32(struct.parameters.size());
        for (Map.Entry<String, String> _iter59 : struct.parameters.entrySet())
        {
          oprot.writeString(_iter59.getKey());
          oprot.writeString(_iter59.getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetTraceId()) {
        optionals.set(0);
      }
      if (struct.isSetParentCallId()) {
        optionals.set(1);
      }
      if (struct.isSetCallId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTraceId()) {
        oprot.writeI64(struct.traceId);
      }
      if (struct.isSetParentCallId()) {
        oprot.writeI64(struct.parentCallId);
      }
      if (struct.isSetCallId()) {
        oprot.writeI64(struct.callId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTracingError struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.token = iprot.readString();
      struct.setTokenIsSet(true);
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
      struct.sampled = iprot.readBool();
      struct.setSampledIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map60 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.parameters = new HashMap<String,String>(2*_map60.size);
        for (int _i61 = 0; _i61 < _map60.size; ++_i61)
        {
          String _key62; // required
          String _val63; // required
          _key62 = iprot.readString();
          _val63 = iprot.readString();
          struct.parameters.put(_key62, _val63);
        }
      }
      struct.setParametersIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.traceId = iprot.readI64();
        struct.setTraceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.parentCallId = iprot.readI64();
        struct.setParentCallIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.callId = iprot.readI64();
        struct.setCallIdIsSet(true);
      }
    }
  }

}

