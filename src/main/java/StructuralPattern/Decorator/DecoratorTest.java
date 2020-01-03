package StructuralPattern.Decorator;

public class DecoratorTest {
    public static void main(String[] args){
        Component c = new ConcreteComponent();
        c.operation();
        System.out.println("------------------");
        Component dec = new ConcreteDecorator(c);
        dec.operation();
    }
}

//Abstract component
interface Component{
    void operation();
}
//Concrete component
class ConcreteComponent implements Component{
    public ConcreteComponent(){
        System.out.println("ConcreteComponent..");
    }
    public void operation(){
        System.out.println("ConcreteComponent ing...");
    }
}

//Abstract decorator
class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    public void operation(){
        component.operation();
    }
}
//Concrete decorator
class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    public void operation(){
        super.operation();
        addFunction();
    }
    public void addFunction(){
        System.out.println("add decorator..");
    }
}

