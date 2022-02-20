package Bridge;

public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    public DefaultChampion(String name, Skin skin) {
        this.name = name;
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move", this.name, skin.getName());
    }

    @Override
    public void SkillQ() {
        System.out.printf("%s %s SkillQ", this.name, skin.getName());
    }

    @Override
    public void SkillW() {
        System.out.printf("%s %s SkillW", this.name, skin.getName());
    }

    @Override
    public void SkillE() {
        System.out.printf("%s %s SkillE", this.name, skin.getName());
    }

    @Override
    public void SkillR() {
        System.out.printf("%s %s SkillR", this.name, skin.getName());
    }
}
