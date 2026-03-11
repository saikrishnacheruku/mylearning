import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-9, 298, 3, 4, 57,1,2,3);

//        List<Integer> hs=numbers.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(hs);

//        List<Integer> hs= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(hs);

        List<String> words = Arrays.asList("java", "spring", "backend", "developer","baackend");
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

        List<Integer> res=  numbers.stream().sorted().skip(3).toList();
        System.out.println(res);

    }
}
