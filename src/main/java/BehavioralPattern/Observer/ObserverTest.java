package BehavioralPattern.Observer;

import java.util.ArrayList;

public class ObserverTest {
    public static void main(String[] args){
        Observer ob1 = new ConcreteObserver1();
        Observer ob2 = new ConcreteObserver2();
        Subject sub = new ConcreteSubject();
        sub.add(ob1);
        sub.add(ob2);
        sub.notifyResponse();
    }
}

abstract class Subject{
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public void add(Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }
    abstract void notifyResponse();
}

class ConcreteSubject extends Subject{
    public void notifyResponse(){
        System.out.println("concrete ing..");
        for(Object obj : observers){
            ((Observer)obj).response();
        }
    }
}

interface Observer{
    void response();
}

class ConcreteObserver1 implements Observer{
    public void response(){
        System.out.println("CO1 ing..");
    }
}
class ConcreteObserver2 implements Observer{
    public void response(){
        System.out.println("CO2 ing..");
    }
}
