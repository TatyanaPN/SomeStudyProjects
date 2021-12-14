import java.util.ArrayList;

public class ReversArray {
/*
Переворачивание данных
*/


    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        //System.out.println("ok");
        int n = numbers.size();
        //System.out.println("ok " + n);
        for (int i = 0; i < (n / 2); i++) {
            Integer temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i - 1));
            numbers.set(n - i - 1, temp);
        }
    }

    private static void print() {
        for (Integer object : numbers) {
            System.out.println(object);
        }
        //System.out.println("end");
    }
}
