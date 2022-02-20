package Composite.after;

public class Client {

    public static void main(String[] args) {

        Component doranBlade = new Item("doran", 450);
        Component healPotion = new Item("물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.getPrice(doranBlade);
        client.getPrice(healPotion);
        client.getPrice(bag);
    }

    private void getPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
