package generics;

public class UtilExamples {

    public static void main(String[] args) {
        Par<Integer, String> p1 = new Par<>(1, "");
        Par<Integer, String> p2 = new Par<>(1, "String");
        Util.comparar(p1, p2);

        Util.max("2", "2");
    }

}
