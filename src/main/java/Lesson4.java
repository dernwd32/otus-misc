import java.util.*;

public class Lesson4 {
    public static void main(String[] args) {

        /* Set<String> fruits = new HashSet<>();
        fruits.add("дыня");
        fruits.add("банан");
        fruits.add("груша");
        fruits.add("яблоко");
        fruits.add("груша");

        fruits.forEach(x -> System.out.println(x));

        //    Map<String, String> test = new HashMap<>();


        //test.
     //   System.out.println(test.get("собако"));
    //    System.out.println(test.toString());
       // test.forEach(x ->  System.out.println(x.toString()));


        int a = 10;
        int b = 0;
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        } finally {
            System.out.println("Результат: " + res);
        }


        Map<String, String> test = new HashMap<>();
        test.put("собако", "бобег");
        test.put("aобако1", "бобег2");
        test.put("обако1", "бобег1");

*/

        SortedMap<String, Integer> map = new TreeMap <String,Integer>();

        map.put("Антон", 5);
        map.put("Сергей", 5);
        map.put("Руслан", 5);
        map.put("Юрий", 4);
        map.put("Николай", 4);
        map.put("Олег", 3);
        map.put("Олег", 5);

        System.out.println(map);

        class LengthComparator implements Comparator<String> {
            public int compare(String o1, String o2) {
                Integer lenghComparedResult = Integer.compare(o1.length(), o2.length());
                return lenghComparedResult != 0 ? lenghComparedResult : o1.compareTo(o2);
            }
        }


        SortedMap<String, Integer> lengthComaredMap = new TreeMap<String,Integer>();

        lengthComaredMap.put("Юрий",4);
        lengthComaredMap.put("Олег",5);
        lengthComaredMap.put("Руслан",4);
        lengthComaredMap.put("Ян",4);

        System.out.println(lengthComaredMap);
//        }

    }
}