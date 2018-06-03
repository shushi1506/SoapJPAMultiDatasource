package com.soap.qlcb.endpoint.util;



import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.core.Utils
 */
public class Commons {
    public static boolean checkString(String input){
        if(input==null || input.equals("?") ||  input.toLowerCase().equals("null") || input.isEmpty()){
            return false;
        }
        return true;
    }
    public static boolean checkString(Object t,String... params){
        for(Field field : t.getClass().getDeclaredFields())
        { field.setAccessible(true);
//            try {
//                if(field.get(t) == null) System.out.printf("Field \"%s\" is null.\n", field.getName());
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
            System.out.printf("%s %s %s%n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(),
                    field.getName());
        }
        System.out.println(params.length);
        for (String param : params) {
            if (!checkString(param))
                return false;
        }
        return true;
    }
}
