package lesson_03.task_Iterable_Iterator;

public class Main {
    public static void main(String[] args) {

//        Option 1. Using foreach statement with Iterable interface.

        MyLinkedList_withIterable list1 = new MyLinkedList_withIterable();

        list1.addToList(new SpecificElement1("Element1"));
        list1.addToList(new SpecificElement2("Element2"));
        list1.addToList(new SpecificElement3("Element3"));

        list1.displayList();

        list1.removeFromList("Element2");

//        NOTE to Option 1: We can directly use foreach statement instead of displayList() method of this custom class
        System.out.println("Option 1 with foreach statement: ");
        for(AbstractElement elem: list1) {
            System.out.printf("%s%n", elem);
        }

//        Option 2. Using while statement with Iterator interface.

        MyLinkedList_withIterator list2 = new MyLinkedList_withIterator();

        list2.addToList(new SpecificElement1("Element1.1"));
        list2.addToList(new SpecificElement2("Element1.2"));
        list2.addToList(new SpecificElement3("Element1.3"));

        System.out.println("--------------------------");

        list2.displayList();

        list2.removeFromList("Element1.2");

//        NOTE to Option 2: We can directly use while statement instead of displayList() method of this custom class
        System.out.println("Option 2 with while statement: ");
        while(list2.hasNext()) {
            System.out.println(list2.next());
        }
    }
}
