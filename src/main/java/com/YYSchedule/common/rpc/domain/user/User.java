/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.YYSchedule.common.rpc.domain.user;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * User Info
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-21")
public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AUTH_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("authToken", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MISSION_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("missionCount", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField AUTHORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("authority", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserTupleSchemeFactory();

  public int userId; // required
  public java.lang.String username; // required
  public java.lang.String password; // optional
  public java.lang.String authToken; // optional
  public int missionCount; // optional
  public int authority; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USERNAME((short)2, "username"),
    PASSWORD((short)3, "password"),
    AUTH_TOKEN((short)4, "authToken"),
    MISSION_COUNT((short)5, "missionCount"),
    AUTHORITY((short)6, "authority");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // USERNAME
          return USERNAME;
        case 3: // PASSWORD
          return PASSWORD;
        case 4: // AUTH_TOKEN
          return AUTH_TOKEN;
        case 5: // MISSION_COUNT
          return MISSION_COUNT;
        case 6: // AUTHORITY
          return AUTHORITY;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERID_ISSET_ID = 0;
  private static final int __MISSIONCOUNT_ISSET_ID = 1;
  private static final int __AUTHORITY_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PASSWORD,_Fields.AUTH_TOKEN,_Fields.MISSION_COUNT,_Fields.AUTHORITY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTH_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("authToken", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MISSION_COUNT, new org.apache.thrift.meta_data.FieldMetaData("missionCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AUTHORITY, new org.apache.thrift.meta_data.FieldMetaData("authority", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
  }

  public User() {
  }

  public User(
    int userId,
    java.lang.String username)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.username = username;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public User(User other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetAuthToken()) {
      this.authToken = other.authToken;
    }
    this.missionCount = other.missionCount;
    this.authority = other.authority;
  }

  public User deepCopy() {
    return new User(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.username = null;
    this.password = null;
    this.authToken = null;
    setMissionCountIsSet(false);
    this.missionCount = 0;
    setAuthorityIsSet(false);
    this.authority = 0;
  }

  public int getUserId() {
    return this.userId;
  }

  public User setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public User setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public User setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public java.lang.String getAuthToken() {
    return this.authToken;
  }

  public User setAuthToken(java.lang.String authToken) {
    this.authToken = authToken;
    return this;
  }

  public void unsetAuthToken() {
    this.authToken = null;
  }

  /** Returns true if field authToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthToken() {
    return this.authToken != null;
  }

  public void setAuthTokenIsSet(boolean value) {
    if (!value) {
      this.authToken = null;
    }
  }

  public int getMissionCount() {
    return this.missionCount;
  }

  public User setMissionCount(int missionCount) {
    this.missionCount = missionCount;
    setMissionCountIsSet(true);
    return this;
  }

  public void unsetMissionCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MISSIONCOUNT_ISSET_ID);
  }

  /** Returns true if field missionCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMissionCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MISSIONCOUNT_ISSET_ID);
  }

  public void setMissionCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MISSIONCOUNT_ISSET_ID, value);
  }

  public int getAuthority() {
    return this.authority;
  }

  public User setAuthority(int authority) {
    this.authority = authority;
    setAuthorityIsSet(true);
    return this;
  }

  public void unsetAuthority() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AUTHORITY_ISSET_ID);
  }

  /** Returns true if field authority is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthority() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AUTHORITY_ISSET_ID);
  }

  public void setAuthorityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AUTHORITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.Integer)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((java.lang.String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((java.lang.String)value);
      }
      break;

    case AUTH_TOKEN:
      if (value == null) {
        unsetAuthToken();
      } else {
        setAuthToken((java.lang.String)value);
      }
      break;

    case MISSION_COUNT:
      if (value == null) {
        unsetMissionCount();
      } else {
        setMissionCount((java.lang.Integer)value);
      }
      break;

    case AUTHORITY:
      if (value == null) {
        unsetAuthority();
      } else {
        setAuthority((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case AUTH_TOKEN:
      return getAuthToken();

    case MISSION_COUNT:
      return getMissionCount();

    case AUTHORITY:
      return getAuthority();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case AUTH_TOKEN:
      return isSetAuthToken();
    case MISSION_COUNT:
      return isSetMissionCount();
    case AUTHORITY:
      return isSetAuthority();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof User)
      return this.equals((User)that);
    return false;
  }

  public boolean equals(User that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_authToken = true && this.isSetAuthToken();
    boolean that_present_authToken = true && that.isSetAuthToken();
    if (this_present_authToken || that_present_authToken) {
      if (!(this_present_authToken && that_present_authToken))
        return false;
      if (!this.authToken.equals(that.authToken))
        return false;
    }

    boolean this_present_missionCount = true && this.isSetMissionCount();
    boolean that_present_missionCount = true && that.isSetMissionCount();
    if (this_present_missionCount || that_present_missionCount) {
      if (!(this_present_missionCount && that_present_missionCount))
        return false;
      if (this.missionCount != that.missionCount)
        return false;
    }

    boolean this_present_authority = true && this.isSetAuthority();
    boolean that_present_authority = true && that.isSetAuthority();
    if (this_present_authority || that_present_authority) {
      if (!(this_present_authority && that_present_authority))
        return false;
      if (this.authority != that.authority)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + userId;

    hashCode = hashCode * 8191 + ((isSetUsername()) ? 131071 : 524287);
    if (isSetUsername())
      hashCode = hashCode * 8191 + username.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    hashCode = hashCode * 8191 + ((isSetAuthToken()) ? 131071 : 524287);
    if (isSetAuthToken())
      hashCode = hashCode * 8191 + authToken.hashCode();

    hashCode = hashCode * 8191 + ((isSetMissionCount()) ? 131071 : 524287);
    if (isSetMissionCount())
      hashCode = hashCode * 8191 + missionCount;

    hashCode = hashCode * 8191 + ((isSetAuthority()) ? 131071 : 524287);
    if (isSetAuthority())
      hashCode = hashCode * 8191 + authority;

    return hashCode;
  }

  @Override
  public int compareTo(User other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAuthToken()).compareTo(other.isSetAuthToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authToken, other.authToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMissionCount()).compareTo(other.isSetMissionCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMissionCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.missionCount, other.missionCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAuthority()).compareTo(other.isSetAuthority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authority, other.authority);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("User(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    if (isSetAuthToken()) {
      if (!first) sb.append(", ");
      sb.append("authToken:");
      if (this.authToken == null) {
        sb.append("null");
      } else {
        sb.append(this.authToken);
      }
      first = false;
    }
    if (isSetMissionCount()) {
      if (!first) sb.append(", ");
      sb.append("missionCount:");
      sb.append(this.missionCount);
      first = false;
    }
    if (isSetAuthority()) {
      if (!first) sb.append(", ");
      sb.append("authority:");
      sb.append(this.authority);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    if (username == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'username' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserStandardScheme getScheme() {
      return new UserStandardScheme();
    }
  }

  private static class UserStandardScheme extends org.apache.thrift.scheme.StandardScheme<User> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AUTH_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authToken = iprot.readString();
              struct.setAuthTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MISSION_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.missionCount = iprot.readI32();
              struct.setMissionCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AUTHORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.authority = iprot.readI32();
              struct.setAuthorityIsSet(true);
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
      if (!struct.isSetUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      if (struct.authToken != null) {
        if (struct.isSetAuthToken()) {
          oprot.writeFieldBegin(AUTH_TOKEN_FIELD_DESC);
          oprot.writeString(struct.authToken);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMissionCount()) {
        oprot.writeFieldBegin(MISSION_COUNT_FIELD_DESC);
        oprot.writeI32(struct.missionCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAuthority()) {
        oprot.writeFieldBegin(AUTHORITY_FIELD_DESC);
        oprot.writeI32(struct.authority);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserTupleScheme getScheme() {
      return new UserTupleScheme();
    }
  }

  private static class UserTupleScheme extends org.apache.thrift.scheme.TupleScheme<User> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.userId);
      oprot.writeString(struct.username);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPassword()) {
        optionals.set(0);
      }
      if (struct.isSetAuthToken()) {
        optionals.set(1);
      }
      if (struct.isSetMissionCount()) {
        optionals.set(2);
      }
      if (struct.isSetAuthority()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetAuthToken()) {
        oprot.writeString(struct.authToken);
      }
      if (struct.isSetMissionCount()) {
        oprot.writeI32(struct.missionCount);
      }
      if (struct.isSetAuthority()) {
        oprot.writeI32(struct.authority);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userId = iprot.readI32();
      struct.setUserIdIsSet(true);
      struct.username = iprot.readString();
      struct.setUsernameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.authToken = iprot.readString();
        struct.setAuthTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.missionCount = iprot.readI32();
        struct.setMissionCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.authority = iprot.readI32();
        struct.setAuthorityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

