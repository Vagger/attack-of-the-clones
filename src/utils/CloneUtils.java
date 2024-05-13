package utils;

import java.lang.reflect.Field;

public class CloneUtils {

    public static Object deepCopy(Object obj) {
        Object deepCopy = new Object();

        Field[] originalFields = obj.getClass().getFields();
        for (Field originalField : originalFields) {
            String fieldName = originalField.getName();
            try {
                deepCopy.getClass().getField(fieldName).set(fieldName, originalField);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
        return obj;
    }
}
