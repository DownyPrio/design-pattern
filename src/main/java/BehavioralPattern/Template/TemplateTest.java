package BehavioralPattern.Template;

public class TemplateTest {
    public static void main(String[] args){
        AbstractClass t = new ConcreteClass();
        t.TemplateMethod();
    }
}

abstract class AbstractClass{
    public void TemplateMethod(){
        SimpleMethod();
        TempMethod1();
        TempMethod2();
    }
    public void SimpleMethod(){
        System.out.println("simple method.");
    }
    abstract public void TempMethod1();
    abstract public void TempMethod2();
}

class ConcreteClass extends AbstractClass{
    public void TempMethod1(){
        System.out.println("method1 ..");
    }
    public void TempMethod2(){
        System.out.println("method2 ..");
    }
}
