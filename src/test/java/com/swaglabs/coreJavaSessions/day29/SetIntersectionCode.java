package day29;

import java.util.*;

public class SetIntersectionCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input set1 from the user
        Set<Integer> set1 = inputSet(scanner, "Enter elements for set1 (separated by spaces):");

        //Input set2 from the user
        Set<Integer> set2 = inputSet(scanner, "Enter elements for set2 (separated by spaces):");


        //Find the intersection (retain all) of the sets
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);



        //print the intersection set
        System.out.println("Intersection of set1 and set2: " + intersectionSet);
    }

    //Method to input set elements from the user
    private static Set<Integer> inputSet(Scanner scanner, String message) {
        System.out.println(message);
        String[] elements = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String element : elements) {
            set.add(Integer.parseInt(element));
        }
        return set;
    }
}
