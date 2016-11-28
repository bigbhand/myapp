package com.bb.apps.myapp.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class User_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.bb.apps.myapp.shared.User instance) throws SerializationException {
    instance.fullName = streamReader.readString();
    instance.lastLogin = streamReader.readString();
    instance.password = streamReader.readString();
    instance.role = streamReader.readString();
    instance.status = streamReader.readString();
    instance.username = streamReader.readString();
    
  }
  
  public static com.bb.apps.myapp.shared.User instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.bb.apps.myapp.shared.User();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.bb.apps.myapp.shared.User instance) throws SerializationException {
    streamWriter.writeString(instance.fullName);
    streamWriter.writeString(instance.lastLogin);
    streamWriter.writeString(instance.password);
    streamWriter.writeString(instance.role);
    streamWriter.writeString(instance.status);
    streamWriter.writeString(instance.username);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.bb.apps.myapp.shared.User_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.bb.apps.myapp.shared.User_FieldSerializer.deserialize(reader, (com.bb.apps.myapp.shared.User)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.bb.apps.myapp.shared.User_FieldSerializer.serialize(writer, (com.bb.apps.myapp.shared.User)object);
  }
  
}
