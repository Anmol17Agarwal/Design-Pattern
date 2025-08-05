package SingletonPattern;

import java.util.function.Supplier;

public class SingletonClient {
    public static void main(String[] args) throws InterruptedException {

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
        testSingletonThreadSafe(()-> Cutlet.getCutlet());
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
