package BehavioralPattern.Mediator;

import java.util.ArrayList;

public class MediatorTest {
    public static void main(String[] args){
        Colleague col1 = new ConcreteColleague1();
        Colleague col2 = new ConcreteColleague2();
        Mediator mediator = new ConcreteMediator();
        mediator.register(col1);
        mediator.register(col2);
        col1.send();
        System.out.println("_______");
        col2.send();
    }
}

abstract class Mediator{
    abstract public void register(Colleague colleague);
    abstract public void relay(Colleague cl);
}

class ConcreteMediator extends Mediator{
    ArrayList<Colleague> colleagues = new ArrayList<Colleague>();
    public void register(Colleague colleague){
        colleagues.add(colleague);
        colleague.setMed(this);
    }
    public void relay(Colleague cl){
        for(Colleague obj : colleagues){
            if(!obj.equals(cl)){
                obj.receive();
            }
        }
    }
}

abstract class Colleague{
    protected Mediator mediator;
    public void setMed(Mediator mediator){
        this.mediator = mediator;
    }
    abstract public void send();
    abstract public void receive();
}

class ConcreteColleague1 extends Colleague{
    public void send(){
        System.out.println("co1 send..");
        mediator.relay(this);
    }
    public void receive(){
        System.out.println("co1 receive..");
    }
}

class ConcreteColleague2 extends Colleague{
    public void send(){
        System.out.println("co2 send..");
        mediator.relay(this);
    }
    public void receive(){
        System.out.println("co2 receive..");
    }
}
