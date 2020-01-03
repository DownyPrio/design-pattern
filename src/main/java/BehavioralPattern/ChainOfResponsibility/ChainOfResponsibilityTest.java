package BehavioralPattern.ChainOfResponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        h1.setNext(h2);
        h1.handlerRequest("two");
    }
}

abstract class Handler{
    private Handler next;
    public void setNext(Handler next){
        this.next = next;
    }
    public Handler getNext(){
        return next;
    }
    abstract public void handlerRequest(String request);
}

class Handler1 extends Handler{
    public void handlerRequest(String request){
        if(request.equals("one")){
            System.out.println("Handler 1 handling");
        }
        else{
            if(getNext() != null){
                getNext().handlerRequest(request);
            }
            else{
                System.out.println("No handler.");
            }
        }
    }
}

class Handler2 extends Handler{
    public void handlerRequest(String request){
        if(request.equals("two")){
            System.out.println("Handler 2 handling..");
        }
        else{
            if(getNext() != null){
                getNext().handlerRequest(request);
            }
            else{
                System.out.println("No handler.");
            }
        }
    }
}
