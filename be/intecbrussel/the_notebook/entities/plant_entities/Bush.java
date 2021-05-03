package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{


    private String Fruit;
    private Leaftype leaftype;

    public Bush(String name, String fruit) {
        super(name);
        Fruit = fruit;
    }

    public Bush(String name, double height, String fruit) {
        super(name, height);
        Fruit = fruit;
    }

    public String getFruit() {
        return Fruit;
    }

    public void setFruit(String fruit) {
        Fruit = fruit;
    }

    public Leaftype getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(Leaftype leaftype) {
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "Fruit='" + Fruit + '\'' +
                ", leaftype=" + leaftype +
                '}';
    }
}
