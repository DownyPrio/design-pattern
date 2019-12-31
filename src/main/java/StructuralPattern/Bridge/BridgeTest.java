package StructuralPattern.Bridge;

public class BridgeTest {
    public static void main(String[] args){
        Implementor imp = new Implemention();
        ConcreteAbstract concreteAbstract = new ConcreteAbstract(imp);
        concreteAbstract.operationAb();
    }
}

interface Implementor{
    void operation();
}

abstract class Abstraction{
    protected Implementor implementor;
    Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    abstract void operationAb();
}

class Implemention implements Implementor{
    public void operation(){
        System.out.println("Implemention..");
    }
}

class ConcreteAbstract extends Abstraction{
    public ConcreteAbstract(Implementor imp){
        super(imp);
    }
    public void operationAb(){
        System.out.println("Concrete..");
        implementor.operation();
    }
}