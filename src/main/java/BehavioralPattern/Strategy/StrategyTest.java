package BehavioralPattern.Strategy;

public class StrategyTest {
    public static void main(String[] args){
        Strategy s = new Strategy2();
        Context c = new Context(s);
        c.strategyMethod();
    }
}

interface Strategy{
    void strategyMethod();
}

class Strategy1 implements Strategy{
    public void strategyMethod(){
        System.out.println("strategy 1");
    }
}

class Strategy2 implements Strategy{
    public void strategyMethod(){
        System.out.println("strategy 2");
    }
}

class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public Strategy getStrategy(){
        return strategy;
    }
    public void strategyMethod(){
        this.strategy.strategyMethod();
    }
}