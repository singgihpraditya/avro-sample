/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.singgih.avro.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"com.singgih.avro.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"username\",\"type\":[\"string\",\"null\"]},{\"name\":\"email_address\",\"type\":[\"string\",\"null\"]},{\"name\":\"phone_number\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence username;
  @Deprecated public java.lang.CharSequence email_address;
  @Deprecated public java.lang.CharSequence phone_number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Person() {}

  /**
   * All-args constructor.
   */
  public Person(java.lang.Integer id, java.lang.CharSequence username, java.lang.CharSequence email_address, java.lang.CharSequence phone_number) {
    this.id = id;
    this.username = username;
    this.email_address = email_address;
    this.phone_number = phone_number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return username;
    case 2: return email_address;
    case 3: return phone_number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: username = (java.lang.CharSequence)value$; break;
    case 2: email_address = (java.lang.CharSequence)value$; break;
    case 3: phone_number = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'username' field.
   */
  public java.lang.CharSequence getUsername() {
    return username;
  }

  /**
   * Sets the value of the 'username' field.
   * @param value the value to set.
   */
  public void setUsername(java.lang.CharSequence value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'email_address' field.
   */
  public java.lang.CharSequence getEmailAddress() {
    return email_address;
  }

  /**
   * Sets the value of the 'email_address' field.
   * @param value the value to set.
   */
  public void setEmailAddress(java.lang.CharSequence value) {
    this.email_address = value;
  }

  /**
   * Gets the value of the 'phone_number' field.
   */
  public java.lang.CharSequence getPhoneNumber() {
    return phone_number;
  }

  /**
   * Sets the value of the 'phone_number' field.
   * @param value the value to set.
   */
  public void setPhoneNumber(java.lang.CharSequence value) {
    this.phone_number = value;
  }

  /** Creates a new Person RecordBuilder */
  public static com.singgih.avro.generated.Person.Builder newBuilder() {
    return new com.singgih.avro.generated.Person.Builder();
  }
  
  /** Creates a new Person RecordBuilder by copying an existing Builder */
  public static com.singgih.avro.generated.Person.Builder newBuilder(com.singgih.avro.generated.Person.Builder other) {
    return new com.singgih.avro.generated.Person.Builder(other);
  }
  
  /** Creates a new Person RecordBuilder by copying an existing Person instance */
  public static com.singgih.avro.generated.Person.Builder newBuilder(com.singgih.avro.generated.Person other) {
    return new com.singgih.avro.generated.Person.Builder(other);
  }
  
  /**
   * RecordBuilder for Person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
    implements org.apache.avro.data.RecordBuilder<Person> {

    private int id;
    private java.lang.CharSequence username;
    private java.lang.CharSequence email_address;
    private java.lang.CharSequence phone_number;

    /** Creates a new Builder */
    private Builder() {
      super(com.singgih.avro.generated.Person.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.singgih.avro.generated.Person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email_address)) {
        this.email_address = data().deepCopy(fields()[2].schema(), other.email_address);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[3].schema(), other.phone_number);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Person instance */
    private Builder(com.singgih.avro.generated.Person other) {
            super(com.singgih.avro.generated.Person.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email_address)) {
        this.email_address = data().deepCopy(fields()[2].schema(), other.email_address);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[3].schema(), other.phone_number);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Integer getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.singgih.avro.generated.Person.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.singgih.avro.generated.Person.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'username' field */
    public java.lang.CharSequence getUsername() {
      return username;
    }
    
    /** Sets the value of the 'username' field */
    public com.singgih.avro.generated.Person.Builder setUsername(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.username = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'username' field has been set */
    public boolean hasUsername() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'username' field */
    public com.singgih.avro.generated.Person.Builder clearUsername() {
      username = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'email_address' field */
    public java.lang.CharSequence getEmailAddress() {
      return email_address;
    }
    
    /** Sets the value of the 'email_address' field */
    public com.singgih.avro.generated.Person.Builder setEmailAddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.email_address = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'email_address' field has been set */
    public boolean hasEmailAddress() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'email_address' field */
    public com.singgih.avro.generated.Person.Builder clearEmailAddress() {
      email_address = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'phone_number' field */
    public java.lang.CharSequence getPhoneNumber() {
      return phone_number;
    }
    
    /** Sets the value of the 'phone_number' field */
    public com.singgih.avro.generated.Person.Builder setPhoneNumber(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.phone_number = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'phone_number' field has been set */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'phone_number' field */
    public com.singgih.avro.generated.Person.Builder clearPhoneNumber() {
      phone_number = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Person build() {
      try {
        Person record = new Person();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.username = fieldSetFlags()[1] ? this.username : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.email_address = fieldSetFlags()[2] ? this.email_address : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.phone_number = fieldSetFlags()[3] ? this.phone_number : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
