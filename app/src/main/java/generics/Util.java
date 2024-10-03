package generics;

public class Util {

    public static <K, V> boolean comparar(Par<K, V> p1, Par<K, V> p2) {
        return p1.getLeft().equals(p2.getLeft()) &&
                p1.getRight().equals(p2.getRight());
    }

    public static <T extends Comparable<T>> T max(T obj1, T obj2) {
        if (obj1.compareTo(obj2) >= 0) {
            return obj1;
        } else {
            return obj2;
        }
    }

}
