package com.pattern.design.singleton;

/**
 * @Author : Krishna Murari, krishnamurari.at@gmail.com
 * This class provides an example of singleton pattern using "double checked locking" to reduce the use of synchronization in getInstance()
 *
 * Volatile keyword is used to mark java variable as being stored in main memory. Every read and write will be from main memory not from CPU cache.
 * @see  Singleton : Provides documentation around use of static variable, private constructor and synchronized call.
 */
public class DoubleCheckedLockingSingleton {

    /**
     * volatile to prevent cache incoherence issues.
     */
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton(){}

    /**
     * Benifits :
     *         a. Synchronised call is used only once so, no such unnecessary expensive synchronised call.
     * Disadvantages:
     *         a. Since it requires the volatile keyword to work properly, it's not compatible with Java 1.4 and lower versions
     *         b. It's quite verbose and it makes the code difficult to read
     *         c. Serialization and deserialization
     *               In order to serialize the above singleton classes, we must implement those classes with a Serializable interface.
     *               If another class X gets the instance of the singleton class and writes it to a file and at a later point
     *               deserializes it to obtain another instance we would have two instances which is against the Singleton principle.
     *
     * Additional questions :
     *    How do you prevent for creating another instance of Singleton during serialization?
     *         -> By using readResolve() method
     */
    public static DoubleCheckedLockingSingleton getInstance(){
        if(uniqueInstance == null){
//          We only synchronise very first time.
            synchronized ( DoubleCheckedLockingSingleton.class) {
                if(uniqueInstance == null){
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
