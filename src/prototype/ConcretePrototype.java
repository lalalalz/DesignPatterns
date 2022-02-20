package prototype;

public class ConcretePrototype implements Prototype {

    private int id;
    private int age;
    private int phone;
    private String name;
    private String address;

    @Override
    public Prototype Clone() {

        ConcretePrototype clone = new ConcretePrototype();

        clone.id = this.id;
        clone.age = this.age;
        clone.phone = this.phone;
        clone.name = this.name;
        clone.address = this.address;

        return clone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameAndAddress() {
        return this.name + this.address;
    }
}


