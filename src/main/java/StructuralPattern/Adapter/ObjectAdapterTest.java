package StructuralPattern.Adapter;

public class ObjectAdapterTest {
    public static void main(String[] args){
        AdapteeOb adapteeOb = new AdapteeOb();
        TargetOb targetOb = new AdapterOb(adapteeOb);
        targetOb.request();
    }
}

interface TargetOb{
    void request();
}
class AdapteeOb{
    public void adapteeRequest(){
        System.out.println("adapteeRequest..");
    }
}
class AdapterOb implements TargetOb{
    private AdapteeOb adapteeOb;
    public AdapterOb(AdapteeOb adapteeOb){
        this.adapteeOb = adapteeOb;
    }
    public void request(){
     adapteeOb.adapteeRequest();
    }
}