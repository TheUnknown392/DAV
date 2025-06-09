package examples.set;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        // Creating object
        Set<Integer> whole_num = new HashSet<>();
        Set<Integer> even_num = new HashSet<>();
        Set<Integer> odd_num = new HashSet<>();
        // adding elements to set
        whole_num.add(1);
        whole_num.add(2);
        whole_num.add(3);
        whole_num.add(4);
        whole_num.add(5);
        whole_num.add(6);
        whole_num.add(7);
        whole_num.add(8);
        whole_num.add(9);

        even_num.add(2);
        even_num.add(4);
        even_num.add(6);
        even_num.add(8);
        even_num.add(10);
        even_num.add(12);
        even_num.add(14);
        even_num.add(16);
        even_num.add(18);

        odd_num.add(1);
        odd_num.add(3);
        odd_num.add(5);
        odd_num.add(7);
        odd_num.add(9);
        odd_num.add(11);
        odd_num.add(13);
        odd_num.add(15);
        odd_num.add(17);
        // displaying directly
        System.out.println("\n" + whole_num);
        System.out.println(even_num);
        System.out.println(odd_num + "\n");
        // displaying elements using loop
        System.out.println("Whole Number given below: \n");
        for (Integer i : whole_num) {
            System.out.println("Whole Number: " + i);

        }
        System.out.println("Even Number given below: \n");
        for (Integer i : even_num) {
            System.out.println("Even Number: " + i);

        }
        System.out.println("Odd Numbers given below: \n");
        for (Integer i : odd_num) {
            System.out.println("Odd Number: " + i);

        }
        // set intersection using retailAll() method
        Set<Integer> intersect_set_a = new HashSet<>(whole_num);
        intersect_set_a.retainAll(even_num); // intersection of even number
        Set<Integer> intersect_set_b = new HashSet<>(whole_num);
        intersect_set_b.retainAll(odd_num); // intersection of odd number
        System.out.println("Intersected Set A: " + intersect_set_a);
        System.out.println("Intersected Set A: " + intersect_set_b);

        // getting the set difference using removeAll() method
        Set<Integer> diff_set_a = new HashSet<>(whole_num);
        Set<Integer> diff_set_b = new HashSet<>(whole_num);
        // Displaying before
        System.out.println("Diff Set A before: " + diff_set_a);
        System.out.println("Diff Set B before: " + diff_set_b);
        // even number difference
        diff_set_a.removeAll(even_num);
        // odd number difference
        diff_set_b.removeAll(odd_num);
        System.out.println("Difference of Wholenumber with Even: " + diff_set_a);
        System.out.println("Difference of Wholenumber with Odd: " + diff_set_b);
        
        // change in element of existing set
        whole_num.add(12);// while change in whole_num but not in diff_set_a
        System.out.println("Whole Number: " + whole_num);
        System.out.println("Diff Set A: " + diff_set_a);

        // create new set with whole number and clear all element using clear()
        Set<Integer> toClear = new HashSet<>(whole_num);
        System.out.println("toClear Before clear: " + toClear);
        toClear.clear(); // clearing elements of toClear
        System.out.println("toClear After clear: " + toClear);
        
    }
}
