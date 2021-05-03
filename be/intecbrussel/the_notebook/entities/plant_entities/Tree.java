package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant{


    private Leaftype leaftype;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public Leaftype getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(Leaftype leaftype) {
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaftype=" + leaftype +
                '}';
    }
}
