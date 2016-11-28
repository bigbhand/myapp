package com.sencha.gxt.core.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FastMap_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static com.sencha.gxt.core.shared.FastMap instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.sencha.gxt.core.shared.FastMap();
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.sencha.gxt.core.shared.FastMap_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.sencha.gxt.core.shared.FastMap_CustomFieldSerializer.deserialize(reader, (com.sencha.gxt.core.shared.FastMap)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.sencha.gxt.core.shared.FastMap_CustomFieldSerializer.serialize(writer, (com.sencha.gxt.core.shared.FastMap)object);
  }
  
}
