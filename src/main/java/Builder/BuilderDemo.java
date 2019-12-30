package Builder;

public class BuilderDemo {

}

class Product{
    private String part1;
    private String part2;
    private String part3;

    public void setPart1(String part1){
        this.part1 = part1;
    }
    public void setPart2(String part2){
        this.part1 = part2;
    }
    public void setPart3(String part3){
        this.part1 = part3;
    }
}
abstract class AbstractBuilder{
    private Product product = new Product();
    abstract public void buildPart1();
    abstract public void buildPart2();
    abstract public void buildPart3();
}