package lesson_04.task_02.OptionWithArray;

import lesson_04.task_02.Exceptions.UnacceptableValueException;

public class Main {
    public static void main(String[] args) throws UnacceptableValueException {

        // Creating a container for strings.
        // A simple Array is used as a container, which does not automatically change its size.
        // Using certain methods, a static array will work like a dynamic array.
        DataContainer_Array<String> stringContainer = new DataContainer_Array<>(String.class);

        //Outputting the contents of a container.
        System.out.printf("\nContainer before add: %s\n", stringContainer);
        // Container size output.
        System.out.printf("Size of container before add: %d\n", stringContainer.getSize());

        // Adding Elements to a Container.
        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        //Outputting the contents of a container.
        System.out.printf("\nContainer after add: %s\n", stringContainer);
        // Container size output.
        System.out.printf("Size of container after add: %d\n\n", stringContainer.getSize());

        // Getting and removing an element by index.
        String fruit = stringContainer.get(1);
        System.out.println("Get fruit at index 1: " + fruit);
        System.out.println("Removed item: " + stringContainer.remove(1));// Banana
        System.out.println("After remove get fruit at index 1: " + stringContainer.get(1));

        System.out.printf("\nContainer after remove: %s\n", stringContainer);
        System.out.printf("Size of container after remove: %d\n", stringContainer.getSize());
        System.out.println("Set current value `" + stringContainer.get(1) + "` to new value: " + stringContainer.set(1, "Pear"));

        // Outputting the contents of a container.
        System.out.printf("\nContainer after value set: %s\n", stringContainer);
        // Container size output.
        System.out.printf("Size of container after value set: %d\n", stringContainer.getSize());
    }
}
