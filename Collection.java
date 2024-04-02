/**
 *
 * @author Dede Jenal Irawan
 */
import java.util.ArrayList;
import java.util.ArrayDeque;
public class Collection {
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Mangga");
        arrayList.add("Apel");
        arrayList.add("Jeruk");

        System.out.println("ArrayList:");
        for (String buah : arrayList) {
            System.out.println(buah);
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        System.out.println("\nArrayDeque:");
        for (int num : arrayDeque) {
            System.out.println(num);
        }
    }
}

