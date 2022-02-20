package Flyweight.after;

public class Character {

    private char value;
    private Font font;

    public Character(char value, Font font) {
        this.value = value;
        this.font = font;
    }

    public char getValue() {
        return value;
    }

    public Font getFont() {
        return font;
    }
}
