package Factory;

/**
 * 多等级结构抽象工厂
 */
public class AbstractFactoryModel {
}

interface Animal{
    public void show();
}

class Cattle implements Animal{
    public void show(){
        System.out.println("Cattle");
    }
}
class Horse implements Animal{
    public void show(){
        System.out.println("Horse");
    }
}
interface Plant{
    public void show();
}

class Flower implements Plant{
    public void show(){
        System.out.println("Flower");
    }
}
class Grass implements Plant{
    public void show(){
        System.out.println("Grass");
    }
}
interface FactoryModel{
    public Animal newAnimal();
    public Plant newPlant();
}

class FactoryM1 implements FactoryModel{
    public Animal newAnimal(){
        return new Horse();
    }
    public Plant newPlant(){
        return new Grass();
    }
}
class FactoryM2 implements FactoryModel{
    public Animal newAnimal(){
        return new Cattle();
    }
    public Plant newPlant(){
        return new Flower();
    }
}
