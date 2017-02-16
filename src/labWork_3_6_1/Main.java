package labWork_3_6_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Bulik on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Class cls = MyClass.class;
        System.out.println(cls.getName());
        printModif(cls);
        printPublicFields(cls);
        printFields(cls);
        printConstructors(cls);
        printMetods(cls);

    }

    static void printModif(Class clazz) {
        int mods = clazz.getModifiers();
        System.out.println("Modifiers: ");
        if (Modifier.isPublic(mods)) {
            System.out.print("\tpublic");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("\tabstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("\tfinal");
        }
        System.out.println();

    }

    static void printPublicFields(Class clazz) {
        System.out.println("Public fields:");
        Field[] fields = clazz.getFields();
        for (Field element : fields) {
            Class typeField = element.getType();
            System.out.println("\tName: " + element.getName());
            System.out.println("\tType: " + typeField.getName());
        }
    }

    static void printFields(Class clazz) {
        System.out.println("All fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field element : fields) {
            Class typeField = element.getType();
            System.out.println("\tName: " + element.getName());
            System.out.println("\tType: " + typeField.getName());
        }
    }

    static void printConstructors(Class clazz){
        System.out.println("Constructors:");
        Constructor [] cons = clazz.getConstructors();
        int count = 0;
        for (Constructor elem : cons){
            System.out.print("\tConstructors " + (++count)+ ": ");
            Class [] typeParams = elem.getParameterTypes();
            for (Class paramType : typeParams){
                System.out.print(paramType.getName() + " ");

            }
            System.out.println();
        }
    }

    static void printMetods(Class clazz){
        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("\tName :"+ method.getName());
            System.out.println("\t\tReturn type: " + method.getReturnType().getName());
            Class [] typeParams =method.getParameterTypes();
            System.out.print("\t\tParam types: ");
            for (Class paramType : typeParams){
                System.out.print(paramType.getName() +" ");
            }
            System.out.println();
        }

    }
}