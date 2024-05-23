package lesson_04.task_02.OptionWithCollection;

import lesson_04.task_02.Exceptions.UnacceptableValueException;

import java.util.*;

public class DataContainer_Collection<T> {
    List<T> list;

    public DataContainer_Collection() {
        this.list = new ArrayList<>();
    }

    public void add (T item) throws UnacceptableValueException {
        if (item == null)
            throw new UnacceptableValueException("Cannot add `null` items to the container");
        this.list.add(item);
    }

    public T set(int index, T item) throws UnacceptableValueException {
        if(this.list.isEmpty())
            throw new UnacceptableValueException("Container is empty.");
        else if (index < 0 || index >= list.size())
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        else if (item == null)
            throw new UnacceptableValueException("Cannot set `null` items to the container");
        return this.list.set(index, item);
    }

    public T get (int index) throws UnacceptableValueException{
        if(this.list.isEmpty())
            throw new UnacceptableValueException("Container is empty.");
        else if (index < 0 || index >= list.size())
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        return this.list.get(index);
    }

    public int getSize () {
        return this.list.size();
    }

    // method for removing an element by index from a container.
    public T remove (int index) throws UnacceptableValueException {
        if (index < 0 || index >= list.size())
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        return this.list.remove(index);
    }

    @Override
    public String toString(){
        return this.list.toString();
    }

}




