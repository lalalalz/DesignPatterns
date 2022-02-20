package Bridge;

public class App {
    public static void main(String[] args) {
//        Champion KDA마린 = new KDA마린();
//        KDA마린.move();
//        KDA마린.SkillE();
//        KDA마린.SkillQ();
//
//        Champion PoolParty마린 = new PoolParty마린();
//        PoolParty마린.move();
//        PoolParty마린.SkillQ();
//        PoolParty마린.SkillW();


        KDA kda = new KDA();
        Champion KDA마린 = new 마린(kda);

        KDA마린.SkillW();
        KDA마린.SkillQ();
        KDA마린.move();

        Champion PoolParty마린 = new 마린(new PoolParty());
        PoolParty마린.move();
        PoolParty마린.SkillE();
        PoolParty마린.SkillQ();

    }
}
