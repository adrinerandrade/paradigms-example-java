package stream;

import java.util.List;

public class FinalOperationExample {

    public static void main(String[] args) {
//        List<String> strResult = List.of(1, 2, 3)
//            .stream()
//            .map(i -> {
//                String value = "O número é: " + i;
//                System.out.println(value);
//                return value;
//            })
//            .collect(Collectors.toList());

        List.of(1, 2, 3, 4, 5, 6, 7, 8)
            .stream()
            .filter(o -> o % 2 == 0)
            .map(integer -> {
                String valor = "O número é: " + integer;
                System.out.println(valor);
                return valor;
            })
            .toList();
    }

}
