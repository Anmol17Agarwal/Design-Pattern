package SingletonPattern;

import java.lang.reflect.Constructor;
import java.util.function.Supplier;

public class SingletonClient {
    public static void main(String[] args) throws Exception {

        /*
        * Lazy initialization
        *
        * Instance is created only when requested, not during class loading.
        *
        * Pros - Saves memory: instance is created only when needed.
        *
        * Cons - Not thread-safe in basic form.
        * Needs synchronization for multithreaded applications.
        *
        * */
        Samosa samosa1 = Samosa.getSamosa();
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        System.out.println(samosa2.hashCode());
        System.out.println(samosa1 == samosa2);

        /*
        * Lazy initialization
        *
        * Instance is created at the time of class loading.
        *
        * Pros - Thread-safe without synchronization.
        * Simple and fast.
        *
        * Cons - Object is created even if it might never be used.
        *
        * */
        Pakoda pakoda1 = Pakoda.getPakoda();
        Pakoda pakoda2 = Pakoda.getPakoda();
        System.out.println(pakoda1.hashCode());
        System.out.println(pakoda2.hashCode());
        System.out.println(pakoda1 == pakoda2);

        /*
         * Lets check that Lazy singleton and Eager singleton is thread-safe or not
         * */

//        testSingletonThreadSafe(()-> Samosa.getSamosa());
//        testSingletonThreadSafe(()-> Pakoda.getPakoda());

        //Thread Safe Lazy Singleton
//        testSingletonThreadSafe(()-> Cutlet.getCutlet());

        /*
        * ways to break singleton pattern
         *  1. Reflection API to break singleton pattern
         * */

        Cutlet cutlet = Cutlet.getCutlet();
        System.out.println(cutlet.hashCode());
        Constructor<Cutlet> constructor1 = Cutlet.class.getDeclaredConstructor();
        //setAccessible(true) because constructor is private now in Cutlet it able to access
        // without this it will throw security exception
        constructor1.setAccessible(true);
        Cutlet cutlet1 = constructor1.newInstance();
        System.out.println(cutlet1.hashCode());
        System.out.println(cutlet == cutlet1);




        /* Solution 1- if Object is there in memory then throw exception from inside the constructor
        * */

        Jalebi jalebi = Jalebi.getCutlet();
        System.out.println(jalebi.hashCode());

//        Constructor<Jalebi> constructor2 = Jalebi.class.getDeclaredConstructor();
//        //setAccessible(true) because constructor is private now in Cutlet it able to access
//        // without this it will throw security exception
//        constructor2.setAccessible(true);
//        Jalebi jalebi1 = constructor2.newInstance();
//        System.out.println(jalebi1.hashCode());

        /*
        * Solution 2 - using Enum
        * */

        Emarti emarti = Emarti.INSTANCE;
        System.out.println(emarti.hashCode());

        Constructor<Emarti> constructor3 = Emarti.class.getDeclaredConstructor();
        //setAccessible(true) because constructor is private now in Cutlet it able to access
        // without this it will throw security exception
        constructor3.setAccessible(true);
        Emarti emarti1 = constructor3.newInstance();
        System.out.println(emarti1.hashCode());

    }




    public static void testSingletonThreadSafe(Supplier<Object> supplier) throws InterruptedException {
        Runnable runnable = () -> {
            Object instance = supplier.get();
            System.out.println(Thread.currentThread().getName() + " " + instance.hashCode());
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        t1.join();
//        t2.join();
//        t3.join();
    }
}
