/**
 *
 * @author acer
 */
import java.util.ArrayList;
import java.util.ArrayDeque;
public class Collection {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        arrayList.add("Mangga");
        arrayList.add("Apel");
        arrayList.add("Jeruk");

        // Menampilkan elemen-elemen ArrayList
        System.out.println("ArrayList:");
        for (String buah : arrayList) {
            System.out.println(buah);
        }

        // Contoh penggunaan ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Menambahkan elemen ke ArrayDeque
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        // Menampilkan elemen-elemen ArrayDeque
        System.out.println("\nArrayDeque:");
        for (int num : arrayDeque) {
            System.out.println(num);
        }
    }
}

