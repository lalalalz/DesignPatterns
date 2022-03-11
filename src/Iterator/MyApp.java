package Iterator;

public class MyApp {

    public static void main(String[] args) {

        Employee<Integer> myList = new Employee<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        MyIterator<Integer> myIterator1 = new ForwardIterator<>(myList.getList());
        MyIterator<Integer> myIterator2 = new ReverseIterator<>(myList.getList());

        myList.print(myIterator1);
        myList.print(myIterator2);

    }
}
