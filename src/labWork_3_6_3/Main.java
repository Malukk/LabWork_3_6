package labWork_3_6_3;
import labWork_3_6_1.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Bulik on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Class clazz = MyClass.class;
        System.out.println(clazz.getName());
        Class[] typeParams = new Class[]{int.class};
        try {
            Constructor constructor = clazz.getConstructor(typeParams);
            MyClass obj = (MyClass)constructor.newInstance(20);
            printFields(obj);

            System.out.println("**************************************");


            Method method = clazz.getMethod("setA", typeParams);
            Object[] argv = new Object[]{new Integer(33)};
            method.invoke(obj, argv );
            printFields(clazz, obj);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void printFields(MyClass myClass){
        System.out.println("a = " + myClass.getA());
        System.out.println("b = " + myClass.getB());
        System.out.println("c = " + myClass.getC());
        System.out.println("d = " + myClass.getD());
    }
    static void printFields(Class clazz, MyClass obj) {
        System.out.println("All fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field element : fields) {
//            Class typeField = element.getType();
            System.out.println("\tName: " + element.getName());
//            System.out.println("\tType: " + typeField.getName());
            try {
                element.setAccessible(true);
                System.out.println("\t\tValue: "+ element.getInt(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
