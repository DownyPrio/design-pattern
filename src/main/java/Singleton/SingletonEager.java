package Singleton;

/**
 * 饿汉式单例
 */
public class SingletonEager {
    public static void main(String[] args){
        Eager eager1 = Eager.getInstance();
        Eager eager2 = Eager.getInstance();
        if(eager1 == eager2){
            System.out.println("Only ONE eager.");
        }
    }
}

class Eager{
    private static Eager eager = new Eager();
    private Eager(){
        System.out.println("Make a eager.");
    }
    public static Eager getInstance(){
        return eager;
    }
    public void getName(){
        System.out.println("A eager.");
    }
}
