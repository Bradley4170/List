public class Main {

    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(23);
        list.add(15);
        list.print();

        list.remove();
        list.print();

        list.remove(23);
        list.print();

    }

}
