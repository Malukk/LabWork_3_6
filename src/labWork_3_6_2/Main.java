package labWork_3_6_2;

import java.lang.reflect.Field;

/**
 * Created by Bulik on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        //String myStr = "abcd";
        String myStr = new String("abcd");

        System.out.println("Old string value: " + myStr);
        updateString(myStr);
        System.out.println("New string value: " + myStr);
        System.out.println("abcd");
    }
    static void updateString(String str){
        char[] symbols = {'z','x', 'c', 'v', 'b', 'n'};
        Class clazz = str.getClass();
        try{
            Field field = clazz.getDeclaredField("value");
            field.setAccessible(true);
            field.set(str, symbols);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
