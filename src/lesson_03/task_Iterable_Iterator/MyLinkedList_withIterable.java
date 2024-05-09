package lesson_03.task_Iterable_Iterator;

import java.util.*;

public class MyLinkedList_withIterable implements Iterable<AbstractElement>{
    List<AbstractElement> elementsList;
    int index;

    public MyLinkedList_withIterable() {
        this.elementsList = new LinkedList<AbstractElement>();
        this.index = 0;
    }

    public void addToList(AbstractElement element){
        this.elementsList.add(element);
    }

    public void removeFromList(String element){
        Iterator<AbstractElement> iteratorForRemove = this.iterator();
        while(iteratorForRemove.hasNext()){
            String nextElem = iteratorForRemove.next().name;
            if(nextElem.equals(element)){
                iteratorForRemove.remove();
                System.out.printf("The element `%s` is removed.%n", nextElem);
                break;
            }
        }
    }

    public void displayList(){
        System.out.println("Option 1 with foreach statement: ");
        for(AbstractElement element: this) {
            System.out.println(element);
        }
    }

    @Override
    public Iterator<AbstractElement> iterator(){
        return new Iterator<AbstractElement>(){
            private int index = -1;

            @Override
            public boolean hasNext(){
                index+=1;
                return index < elementsList.size();
            }

            @Override
            public AbstractElement next(){
                return elementsList.get(index);
            }

            @Override
            public void remove(){
                elementsList.remove(index);
            }
        };
    }
}