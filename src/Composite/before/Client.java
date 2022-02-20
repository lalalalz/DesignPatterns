package Composite.before;

public class Client {

    public static void main(String[] args) {

        Item doranBlade = new Item("doran", 450);
        Item healPotion = new Item("물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.getPrice(doranBlade);
        client.getPrice(healPotion);
        client.getPrice(bag);
    }

    private void getPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void getPrice(Bag bag) {
        System.out.println(bag.getItems().stream().mapToInt(item -> item.getPrice()).sum());
    }

}
