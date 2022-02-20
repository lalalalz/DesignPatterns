package Flyweight.after;

public class Client {
    public static void main(String[] args) {

        FontFactory fontFactory = new FontFactory();

        Character c3 = new Character('l', fontFactory.getFont("Nanum:12"));
        Character c1 = new Character('h', fontFactory.getFont("Nanum:12"));
        Character c4 = new Character('l', fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('e', fontFactory.getFont("Nanum:12"));
        Character c5 = new Character('o', fontFactory.getFont("Nanum:12"));

        System.out.println(c1.getFont());
        System.out.println(c2.getFont());
        System.out.println(c3.getFont());
        System.out.println(c4.getFont());

    }
}
