import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int counter : nums) {
            if (counter % 2 != 0) {
                System.out.print(counter + ", ");
            }
        }
        System.out.println();

        System.out.println("Задание 2");
        nums = new ArrayList<>(List.of(8, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numTwo = new ArrayList<>();
        for (int counter : nums) {
            if (counter % 2 == 0 && !numTwo.contains(counter)) {
                numTwo.add(counter);
            }
        }
        Collections.sort(numTwo);
        for (int counter : numTwo) {
            System.out.print(counter + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("пять", "один", "два", "два", "три", "три", "три"));
        List<String> stringsTwo = new ArrayList<>();
        for (String counter : strings) {
            if (!stringsTwo.contains(counter)) {
                stringsTwo.add(counter);
            }
        }
        System.out.println(stringsTwo + ", ");
        System.out.println();

        System.out.println("Задание 4");
        strings = new ArrayList<>(List.of("пять", "один", "два", "два", "три", "три", "три", "два",
                "один", "два", "четыре", "ноль"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            int count = Collections.frequency(strings, string);
            map.put(string, count);
        }
        System.out.println(map);
    }
}
