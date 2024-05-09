package lesson_03.task_Iterable_Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList_withIterator implements Iterator<AbstractElement> {
    List<AbstractElement> elementsList;
    int index;

    public MyLinkedList_withIterator(){
        this.elementsList = new LinkedList<AbstractElement>();
        this.index = -1;
    }

    public void addToList(AbstractElement element){
        elementsList.add(element);
    }

    public void removeFromList(String element){
        while(this.hasNext()){
            String nextElem = this.next().name;
            if (nextElem.equals(element)){
                this.remove();
                System.out.printf("The element `%s` is removed.%n", nextElem);
                break;
            }
        }
        index = -1;
    }

    public void displayList(){
        System.out.println("Option 2 with while statement: ");
        while(this.hasNext()){
            System.out.println(this.next());
        }
        index = -1;
    }
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
}
