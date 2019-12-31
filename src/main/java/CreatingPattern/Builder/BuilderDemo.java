package CreatingPattern.Builder;

public class BuilderDemo {
    public static void main(String[] args){
        AbstractBuilder builder = new BuilderA();
        AbstractBuilder builderc = new BuilderB();
        Driver driver = new Driver(builderc);
        Product product = driver.driverConstruct();
        product.show();
    }


}

class Product{
    private String part1;
    private String part2;
    private String part3;

    public void setPart1(String part1){
        this.part1 = part1;
    }
    public void setPart2(String part2){
        this.part2 = part2;
    }
    public void setPart3(String part3){
        this.part3 = part3;
    }
    public void show(){
        System.out.println("part 1: "+this.part1);
        System.out.println("part 2: "+this.part2);
        System.out.println("part 3: "+this.part3);
    }
}
abstract class AbstractBuilder{
    protected Product product = new Product();
    abstract public void buildPart1();
    abstract public void buildPart2();
    abstract public void buildPart3();
    Product getProduct(){
        return this.product;
    }
}
class BuilderA extends AbstractBuilder{
    public void buildPart1(){
        product.setPart1("A1");
        System.out.println("A1.");
    }
    public void buildPart2(){
        product.setPart2("A2");
        System.out.println("A2.");
    }
    public void buildPart3(){
        product.setPart3("A3");
        System.out.println("A3.");
    }
}

class BuilderB extends AbstractBuilder{
    public void buildPart1(){
        product.setPart1("B1");
        System.out.println("B1.");
    }
    public void buildPart2(){
        product.setPart2("B2");
        System.out.println("B2.");
    }
    public void buildPart3(){
        product.setPart3("B3");
        System.out.println("B3.");
    }
}

class Driver{
    private AbstractBuilder builder;
    Driver(AbstractBuilder builder){
        this.builder = builder;
    }
    Product driverConstruct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getProduct();
    }
}