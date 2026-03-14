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

     //   List<String> words = List.of("apple", "banana", "kiwi","kavi","janana");
//
//       String res= words.stream().min(Comparator.comparingInt(String::length)).orElse("");
//        System.out.println(res);

//        Map<Integer,List<String>> res=words.stream().collect(Collectors.groupingBy(x->x.length()));
//
//        System.out.println(res);

//        List<Person> people = List.of(
//                new Person("Alice", 25),
//                new Person("Bob", 30),
//                new Person("Charlie", 25)
//        );
//
//        Map<Integer, List<Person>> map =
//                people.stream()
//                        .collect(Collectors.groupingBy(Person::getAge));
//
//
//        List<Integer> list1 = List.of(1, 2, 3);
//        List<Integer> list2 = List.of(2, 5, 6);
//
//        List<Integer> res=Stream.concat(list2.stream(),list1.stream()).toList();
//        System.out.println(res);
// 25 find longest string
//       List<String> words = List.of("apple", "banana", "kiwi");
//
//        String res=words.stream().max(Comparator.comparingInt(String::length)).orElse("");
//        System.out.println(res);
// // 26 group a list of strings
//           List<String> words = List.of("apple", "banana", "kiwi","kavi","janana");
//
//       Map<Integer,List<String>> res=    words.stream().collect(Collectors.groupingBy(String::length));
//        System.out.println(res);

        // 30 merge 2 list into single
//        List<Integer> list1 = List.of(1, 2, 3);
//        List<Integer> list2 = List.of(4, 5, 6);
//
//        List<Integer> res=Stream.concat(list2.stream(),list1.stream()).collect(Collectors.toList());
//        System.out.println(res);
// union of 2 lists
//        List<Integer> list1 = List.of(1, 2, 3, 4);
//        List<Integer> list2 = List.of(3, 4, 5, 6);

      //  List<Integer> res=Stream.concat(list1.stream(),list2.stream()).distinct().toList();

     //   System.out.println(res);

        // intersection of 2 list

//        List<Integer> res=list1.stream().filter(x->list2.contains(x)).toList();
//        System.out.println(res);
//
        // diffrence of 2 lists
//        List<Integer> res=list1.stream().filter(x->!list2.contains(x)).toList();
//        System.out.println(res);

        List<Integer> list1 = List.of(1, 2, 3, 4,5,6,3,2,5);
//
//      Map<Integer,Long> res= list1.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
//     //   System.out.println(res);
//
//        String word="hello sai babu";
//       Map<Character,Long> res1= word.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(s->s,Collectors.counting()));
//
//        System.out.println(res1);

      //  String word="Hello Hello my name is my hello u u u";
//       Map<String,Long> res= Arrays.stream(word.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().filter(x->x.getValue()=="");
//
//        System.out.println(res);

//        Map<Character,Long> res=   word.chars().mapToObj(x->(char)x).filter(x->"aeiou".contains(String.valueOf(x))).collect(Collectors.groupingBy(s->s,Collectors.counting()));
//     //   System.out.println(res);
//
//
//        List<Integer> reversed = list1.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//                    Collections.reverse(list);
//                    return list;
//                }));
//
//        System.out.println(reversed);

        String  word="Hello";
       String res= word.chars().mapToObj(x->String.valueOf((char) x)).reduce("",(a,b)->b+a);
        System.out.println(res);


    }
}
