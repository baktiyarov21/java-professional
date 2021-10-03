package reflection.lesson;

import java.lang.reflect.Modifier;

public class ReflectionModifier {
    private static final class MyModifier {

    }

    public static void main(String[] args) {
        Class<?> cl = MyModifier.class;
        System.out.println(cl.getName());
        System.out.println();
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final");
        }

    }
}
