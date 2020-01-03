package BehavioralPattern.Template;

public class TemplateExtTest {
    public static void main(String[] args){
        AbstractClassExt c = new ConClass();
        c.Method();
    }
}

abstract class AbstractClassExt{
    public void Method(){
        Method1();
        Hook1();
        if(Hook2())
        {
            Method2();
        }
        Method3();
    }
    public void Method1(){};
    public void Method2(){};
    public void Method3(){};
    public void Hook1(){};
    public boolean Hook2(){
        return false;
    }
}

class ConClass extends AbstractClassExt{
    public void Method1(){
        System.out.println("method1 ..");
    }
    public void Method2(){
        System.out.println("method2 ..");
    }
    public void Method3(){
        System.out.println("method3 ..");
    }
    public void Hook1(){
        System.out.println("hook1 ..");
    }
    public boolean Hook2(){
        return true;
    }
}
