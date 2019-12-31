package StructuralPattern.Adapter;

public class ClassAdapterTest {
    public static void main(String[] args){
        Target target = new Adapter();
        target.request();
    }
}

interface Target{
    void request();
}

class Adaptee{
    public void adapteeRequest(){
        System.out.println("adapteeRequest...");
    }
}
class Adapter extends Adaptee implements Target{
    public void request(){
        adapteeRequest();
        System.out.println("adapter working...");
    }

}