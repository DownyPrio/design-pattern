package StructuralPattern.Facade;

public class FacadeTest {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.method();
    }
}

class Facade{
    private Subject1 subject1 = new Subject1();
    private Subject2 subject2 = new Subject2();
    private Subject3 subject3 = new Subject3();
    public void method(){
        subject1.method1();
        subject2.method2();
        subject3.method3();
    }
}
class Subject1{
    public void method1(){
        System.out.println("Subject1 ing...");
    }
}
class Subject2{
    public void method2(){
        System.out.println("Subject2 ing...");
    }
}
class Subject3{
    public void method3(){
        System.out.println("Subject3 ing...");
    }
}

