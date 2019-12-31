package StructuralPattern.Proxy;

public class ProxyTest {
    public static void main(String[] args){
        Proxy proxy =new Proxy();
        proxy.request();

    }
}

interface AbsSubject{
    void request();
}

class RealSubject implements AbsSubject{
    public void request(){
        System.out.println("requesting...");
    }
}

class Proxy{
    private AbsSubject subject;
    public void preRequest(){
        System.out.println("pre request...");
    }
    public void request(){
        if(subject == null){
            subject = new RealSubject();
        }
        preRequest();
        subject.request();
        postRequest();
    }
    public void postRequest(){
        System.out.println("post request...");
    }
}
