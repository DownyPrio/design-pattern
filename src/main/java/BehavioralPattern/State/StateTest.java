package BehavioralPattern.State;

public class StateTest {
    public static void main(String[] args){
        Context context = new Context();
        context.handler();
        context.handler();
        context.handler();
    }
}

interface State{
    void handler(Context context);
}

class Context{
    private State state;
    public Context(){
        this.state = new ConcreteStateA();
    }

    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
    public void handler(){
        state.handler(this);
    }
}

class ConcreteStateA implements State{
    public void handler(Context context){
        System.out.println("concrete A");
        context.setState(new ConcreteStateB());
    }
}
class ConcreteStateB implements State{
    public void handler(Context context){
        System.out.println("concrete B");
        context.setState(new ConcreteStateA());
    }
}
