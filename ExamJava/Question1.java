package ExamJava;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        List<String> listStrings=new ArrayList<String>();
        System.out.println("Adding Fruits:");
        listStrings.add("Apple");
        listStrings.add("Banana");
        listStrings.add("Kiwi");
        listStrings.add("Grapes");
        listStrings.add("Cherry");
        listStrings.add("Watermelon");
        listStrings.add("Orange");
        listStrings.add("Mango");
        listStrings.forEach((fruit)-> System.out.println(fruit));

    }
}
