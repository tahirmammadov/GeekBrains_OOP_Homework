package lesson_03.task_Iterable_Iterator;

public abstract class AbstractElement {
    public String name;

    public AbstractElement(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
