package org.netCar.util;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

/**
 * json序列化工具类
 *
 */
public class JsonUtil {

    public static <T> String toJson(T model){
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(model);
        } catch (Exception e) {
            return "";
        }
    }
    
    public static <T> T toModel(String json, Class<T> classOfT){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return (T)objectMapper.readValue(json, classOfT);
        } catch (Exception e) {
            return  null;
        }
        
    }
    
    public static Map<String, Object> toMap(String json){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Map.class);
        } catch (Exception e) {
            return  null;
        }
        
    }
    

    private static ObjectMapper objectMapper = new ObjectMapper();
    
    public static <T> T json2Obj(String str, Class<T> clazz) {
		try {
			return objectMapper.readValue(str, clazz);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
    public static String obj2Str(Object obj) {
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
    
    public static <T> List<T> extractList(String json, List<T> list) {
		if (json == null || json.length() == 0) return list;
		List<T> output = null;
		try {
			output = objectMapper.readValue(json, list.getClass());
		} catch (JsonParseException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return (output == null) ? list : output;
	}

	public static <T> List<T> extractList(String json, Class c) {
		if (StringUtils.isEmpty(json)) return null;
		JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, c);
		try {
			return objectMapper.readValue(json, javaType);
		} catch (JsonParseException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

    
    public static void main(String[] arg){
    	
    }
}
