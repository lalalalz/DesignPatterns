package Adapter.security;

public class Singleton {

    private Singleton() {};

    private static class Holder {
        public static Singleton INSTNACE = new Singleton();
    }

    public Singleton getInstance() {
        return Holder.INSTNACE;
    }
}


