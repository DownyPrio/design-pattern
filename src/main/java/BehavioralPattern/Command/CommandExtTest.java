package BehavioralPattern.Command;

import java.util.ArrayList;

public class CommandExtTest {
    public static void main(String[] args){
        CommandExt command1 = new CommandExt1();
        CommandExt command2 = new CommandExt2();
        CompositeInvoker compositeInvoker = new CompositeInvoker();
        compositeInvoker.setCommand(command1);
        compositeInvoker.setCommand(command2);
        compositeInvoker.call();
    }
}

interface CommandExt{
    void execute();
}

class CommandExt1 implements CommandExt{
    private CompositeReceiver compositeReceiver = new CompositeReceiver();
    public void execute(){
        compositeReceiver.action1();
    }
}

class CommandExt2 implements CommandExt{
    private CompositeReceiver compositeReceiver = new CompositeReceiver();
    public void execute(){
        compositeReceiver.action2();
    }
}

class CompositeInvoker{
    ArrayList<CommandExt> commands = new ArrayList();
    public void setCommand(CommandExt command){
        commands.add(command);
    }
    public CommandExt getCommand(int i){
        return commands.get(i);
    }
    public void remove(CommandExt command){
        commands.remove(command);
    }
    public void call(){
        for(CommandExt command : commands){
            command.execute();
        }
    }
}

class CompositeReceiver{
    public void action1(){
        System.out.println("action1..");
    }
    public void action2(){
        System.out.println("action2..");
    }
}
