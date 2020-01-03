package StructuralPattern.FlyWeight;

import javax.swing.plaf.PanelUI;
import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class FlyWeightTest {
    public static void main(String[] args){
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight f1 = factory.getFlyWeight("a");
        FlyWeight f2 = factory.getFlyWeight("a");
        FlyWeight f3 = factory.getFlyWeight("b");
        FlyWeight f4 = factory.getFlyWeight("b");
        f1.operation(new UnsharedConcreteFlyWeight("FIRST a" ));
        f2.operation(new UnsharedConcreteFlyWeight("SECOND a" ));
        f3.operation(new UnsharedConcreteFlyWeight("FIRST b" ));
        f4.operation(new UnsharedConcreteFlyWeight("SECOND b" ));
    }
}

class UnsharedConcreteFlyWeight{
    private String info;
    public UnsharedConcreteFlyWeight(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}

interface FlyWeight{
    void operation(UnsharedConcreteFlyWeight outstate);
}

class ConcreteFlyWeight implements FlyWeight{
    private String key;
    public ConcreteFlyWeight(String key){
        this.key = key;
        System.out.println("FlyWeight " + key + "init..");
    }
    public void operation(UnsharedConcreteFlyWeight outstate){
        System.out.println(outstate.getInfo());
    }
}

class FlyWeightFactory{
    HashMap<String, FlyWeight> flyWeights = new HashMap<String, FlyWeight>();
    public FlyWeight getFlyWeight(String key){
        FlyWeight fw =  Optional.ofNullable(flyWeights.get(key)).orElse(null);
        if(fw == null){
            fw = new ConcreteFlyWeight(key);
            flyWeights.put(key, fw);
        }
        else{
            System.out.println("key " + key + "successed!");
        }
        return fw;
    }
}
