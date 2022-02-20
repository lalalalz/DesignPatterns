package Bridge;

public class KDA implements Skin {

    public String name = "KDA";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
