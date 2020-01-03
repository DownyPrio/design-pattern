package StructuralPattern.Composite;

import java.util.ArrayList;

public class CompositeTest {
    public static void main(String[] args){
        Leaf leaf1 = new Leaf("leaf_1");
        Leaf leaf2 = new Leaf("leaf_2");
        Leaf leaf3 = new Leaf("leaf_3");
        Component c = new Composite();
        c.add(leaf1);
        c.add(leaf2);
        c.add(leaf3);
        c.operation();
    }
}

interface Component{
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}

class Leaf implements Component{
    private String name;
    Leaf(String name){
        this.name = name;
    }
    public void add(Component c){};
    public void remove(Component c){};
    public Component getChild(int i){
        return null;
    }
    public void operation(){
        System.out.println("Leaf " + name + " created.");
    }
}
class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<>();
    public void add(Component c){
        children.add(c);
    }
    public void remove(Component c){
        children.remove(c);
    }
    public Component getChild(int i){
        return children.get(i);
    }
    public void operation(){
        for(Component leaf:children){
            leaf.operation();
        }
    }
}
