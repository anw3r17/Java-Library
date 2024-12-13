import java.util.*;
public class ListSetMap {
    public static void main(String arg[]){
        //list
        List<String> l = new ArrayList<>();
        l.add("Appul");
        l.add("Banana");
        l.add("Watermelon");
        l.add("Orange");
        System.out.println("Element in list at first position:" + l.get(0));
        System.out.println("The list is:");
        for(String fruit : l){
            System.out.println(fruit);
        }
        //iterator for list
        System.out.println("Iterating through list:");
        Iterator<String> r = l.iterator();
        while(r.hasNext()){
            System.out.println(" " + r.next());
        }
        //map (hashmap)
        Map<String, Integer> m = new HashMap<>();
        m.put("Appul", 10);
        m.put("Banana", 20);
        m.put("Strawberry", 30);
        System.out.println("The Appul element is present at value:" + m.get("Appul"));
        System.out.println("The Map is:\n" + m);
        //set (hashset)
        Set<String> s = new HashSet<>();
        s.add("Appul");
        s.add("Orange");
        s.add("banana");
        System.out.println("The set is:");
        for(String fruit : s){
            System.out.println(fruit);
        }

    }
}
