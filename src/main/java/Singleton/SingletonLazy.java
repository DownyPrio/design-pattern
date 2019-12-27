package Singleton;

/**
 * 懒汉式单例
 * 可通过List构造有限多例
 */

public class SingletonLazy {
    public static void main(String[] args){
        President president1 = President.getInstance();
        President president2 = President.getInstance();
        Boolean eq = president1 == president2;
    }

}

class President{
    private static volatile President instance = null;
    private President(){
        System.out.println("Make a president.");
    }

    public static synchronized President getInstance( ){
        if(instance == null){
            instance = new President();
        }
        else {
            System.out.println("Pri exists.");
        }
        return instance;
    }
    public void getName(){
        System.out.println("Prisident.");
    }
}
