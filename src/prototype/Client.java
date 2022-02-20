package prototype;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype protoytpe = new ConcretePrototype();

        protoytpe.setName("최진수 ");
        protoytpe.setAddress("인천 중구 인항로 30");

        System.out.println(protoytpe.getNameAndAddress());

        ConcretePrototype clone = (ConcretePrototype) protoytpe.Clone();

        System.out.println(clone.getNameAndAddress());
    }
}
