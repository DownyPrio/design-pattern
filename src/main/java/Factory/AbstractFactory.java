package Factory;

interface Factory {
    public Product newProduct();
}
class Factory1 implements Factory{
    public Product newProduct(){
        System.out.println("product1 make.");
        return new Product1();
    }
}
class Factory2 implements Factory{
    public Product newProduct(){
        System.out.println("product2 make.");
        return new Product2();
    }
}
interface Product{
    public void show();
}
class Product1 implements Product{
    public void show(){
        System.out.println("this is product1.");
    }
}
class Product2 implements Product{
    public void show(){
        System.out.println("this is product2.");
    }
}

public class AbstractFactory{
    public static void main(String[] args){
        char flag = '1';
        Factory factory = null;
        switch (flag){
            case '1':
                factory = new Factory1();
                break;
            case '2':
                factory = new Factory2();
                break;
        }
        factory.newProduct();

    }
}