package BehavioralPattern.Command;

public class CommandTest {
    public static void main(String[] args){
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}

interface Command{
    void execute();
}

class ConcreteCommand implements Command{
    private Receiver receiver;
    public ConcreteCommand(){
        this.receiver = new Receiver();
    }
    public void setReceiver(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute(){
        System.out.println("Concrete command executing.");
        receiver.action();
    }
}

class Invoker{
    Command command;
    Invoker(Command command){
        this.command = command;
    }
    void setCommand(Command command){
        this.command = command;
    }
    void call(){
        System.out.println("Invoker calling..");
        command.execute();
    }
}


class Receiver{
    public void action(){
        System.out.println("Receiver ing..");
    }
}
