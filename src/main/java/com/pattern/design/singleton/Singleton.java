package com.pattern.design.singleton;

/**
 * @Author : Krishna Murari, krishnamurari.at@gmail.com
 * This class provides an example of singleton pattern using lazy initialization.
 */
public class Singleton {

    /**
     * We've a static variable to hold our one instance of the Singleton class.
     */
    private static Singleton uniqueInstance;

    /**
     *  Private constructor ensures only Singleton can instantiate this class.
     */
    private Singleton(){}

    /**
     * By using synchronized keyword, we force every thread to wait before it can enter the method.
     *  i.e no two threads calls constructor at same time.
     *
     *  Since this method is static, it can be accessed from anywhere.
     *  Advantage :
     *          a. Access is as easy as accessing a global variable
     *          b. Lazy initialization. (Especially useful when it's a resource intensive object)
     *  Drawback :
     *          a. After first time, synchronized is an unneeded overhead.
     *          b. synchronized method is expensive
     *             References : https://tinyurl.com/yxrm6485  https://tinyurl.com/y5wmbkwe
     *          c. Serialization and Deserialization issue : https://tiny.amazon.com/137wvl8yg/stacques3930howt
     * @see DoubleCheckedLockingSingleton
     * @see DoubleCheckedLockingSingleton#getInstance()
     */
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
