import java.util.ArrayList;

import lists.DynamicArray;

public class ListsMain {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(16);
        array.add(17);
        array.add(18);
        array.add(19);
        array.add(20);

        array.viewContent();
        System.out.println(array.size());

        // * Using ArrayLists
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("Apples");
        groceryList.add("Oranges");
        groceryList.add("Bananas");

        System.out.println(groceryList);
        System.out.println(groceryList.size());
        System.out.println(groceryList.get(0));
        System.out.println("Is my grocery list empty? " + groceryList.isEmpty());

        // * Using wrapper classes for primitive types in ArrayLists
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println(intList);

        Integer myNumber = 42;
        System.out.println(myNumber.hashCode());

        intList.add(myNumber);
        System.out.println(intList);

    }
}
