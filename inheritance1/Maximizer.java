import java.util.ArrayList;
import java.util.List;

/**
 * Created by hug.
 */
public class Maximizer {
    //public static <T> Comparable<T> max( items) {
//        items.compareTo()
 //  }

    public static <T extends Comparable<? super T>> T max(T[] objects) {
        objects[0].compareTo(objects[1]);
        return objects[0];
    } // sp15 generics lecture from 61b i used to teach this

    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog();
        Dog[] dogs = new Dog[5];
        Dog biggest = max(dogs);
        List<Integer> L = new ArrayList<>();
        ArrayList<Integer> L2 = (ArrayList<Integer>) L;
    }
}