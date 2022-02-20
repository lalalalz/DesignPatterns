package Flyweight.after;

public final class Font {

    private String fontColor;
    private String fontFamily;
    private int fontSize;

    public Font(String fontColor, String fontFamily, int fontSize) {
        this.fontColor = fontColor;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
