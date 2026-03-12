import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

       // List<Integer> numbers = Arrays.asList(-9, 298, 3, 4, 57,1,2,3);

//        List<Integer> hs=numbers.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(hs);

//        List<Integer> hs= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(hs);

    //    List<String> words = Arrays.asList("java", "spring", "backend", "developer","baackend");
//
//        List<String> res= words.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(res);

//        boolean res=numbers.stream().anyMatch(x->x==30);
//        System.out.println(res);

//        List<Integer>  res=  numbers.stream().distinct().toList();
//        System.out.println(res);

//        List<Integer>  res= numbers.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).toList();
//        System.out.println(res);

//        List<Integer>  res= numbers.stream().sorted().toList();
//        System.out.println(res);

//        List<String>  res= words.stream().sorted().toList();
//        System.out.println(res);

//        Map<String,Integer>  res= words.stream().collect(Collectors.toMap(x->x,x->x.length()));
//        System.out.println(res);

//        List<String> res=words.stream().filter(x->x.startsWith("A")).toList();
//        System.out.println(res);

//        Long count=words.stream().filter(x->x.startsWith("d")).count();
//        System.out.println(count);

//        Integer maxVal=numbers.stream().max((a,b)->a-b).orElse(0);
//        System.out.println(maxVal);

//        Integer maxVal=numbers.stream().min((a,b)->a-b).orElse(0);
//        System.out.println(maxVal);

//      List<Integer> res=  numbers.stream().sorted(Comparator.reverseOrder()).skip(3).toList();
//        System.out.println(res);

//        List<Integer> res=  numbers.stream().sorted().skip(3).toList();
//        System.out.println(res);


//        int number = 12345;
//        Integer res=String.valueOf(number).chars().map(Character::getNumericValue).sum();
//        System.out.println(res);

//        int n=5;
//       Integer res= IntStream.range(1,n+1).reduce((a,b)->a*b).orElse(1);
//        System.out.println(res);


//        Integer res=numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
//        System.out.println(res);
//
//        Integer res1=numbers.stream().sorted().skip(1).findFirst().orElse(0);
//        System.out.println(res1);

        List<String> words = List.of("apple", "banana", "kiwi","kavi","janana");
//
//       String res= words.stream().min(Comparator.comparingInt(String::length)).orElse("");
//        System.out.println(res);

//        Map<Integer,List<String>> res=words.stream().collect(Collectors.groupingBy(x->x.length()));
//
//        System.out.println(res);

        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25)
        );

        Map<Integer, List<Person>> map =
                people.stream()
                        .collect(Collectors.groupingBy(Person::getAge));


        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(2, 5, 6);

        List<Integer> res=Stream.concat(list2.stream(),list1.stream()).toList();
        System.out.println(res);



    }
}
