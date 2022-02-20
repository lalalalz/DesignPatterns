package Singleton;

public class Singleton {

    private static Singleton _instance;

    private Singleton() {
        System.out.println("싱글톤 인스턴스가 실행되었습니다.");
        System.out.println(System.identityHashCode(this));
    };

    public static class Holder {
        public static Singleton INSTANCE = new Singleton();
    }

    public static Singleton Instance() {
        return Holder.INSTANCE;
    }
}
