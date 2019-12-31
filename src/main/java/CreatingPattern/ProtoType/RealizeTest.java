package CreatingPattern.ProtoType;

public class RealizeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Realize realize1 = new Realize();
        Realize realize2 = realize1.clone();
        if(realize1 != realize2){
            System.out.println("Not equal.");
        }
        realize2.setName("b");
        realize1.display();
        realize2.display();
    }
}

class Realize implements Cloneable{
    Realize(){
        System.out.println("Create.");
    }
    private String name = "a";

    public Realize clone() throws CloneNotSupportedException{
        System.out.println("Copy successfully.");
        return (Realize)super.clone();
    }
    public void setName(String string){
        this.name = string;
    }
    public void display(){
        System.out.println(this.name);
    }
}
