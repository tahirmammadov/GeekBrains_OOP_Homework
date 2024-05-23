package lesson_04.task_02.OptionWithArray;

import lesson_04.task_02.Exceptions.UnacceptableValueException;

import java.lang.reflect.Array;
import java.util.*;

public class DataContainer_Array<T> {
    private T[] array;
    private int addedSize;
    public final Class Tclass; // This class is needed for reflection. in this example it is needed to use generics in a regular array.

    public DataContainer_Array(Class<T> clazz) {
        this.addedSize = 0;
        this.Tclass = clazz;
        this.array = (T[]) Array.newInstance(Tclass, 2); // declare simple array with generic types
        // 2-nd option to declare array with generic types is: Object[] array = new Object[length];
    }

    public void add (T item) throws UnacceptableValueException{
        if (item == null)
            throw new UnacceptableValueException("Cannot add `null` items to the container");
        if (addedSize == this.array.length) {
            array = Arrays.copyOf(array, this.array.length+1);
        }
        this.array[addedSize] = item;
        addedSize++;
    }

    public T set(int index, T item) throws UnacceptableValueException{
        if(this.array.length == 0)
            throw new UnacceptableValueException("Container is empty.");
        else if (index < 0 || index >= array.length)
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        else if (item == null)
            throw new UnacceptableValueException("Cannot set `null` items to the container");
        this.array[index] = item;
        return this.array[index];
    }

    public T get (int index) throws UnacceptableValueException{
        if(this.array.length == 0)
            throw new UnacceptableValueException("Container is empty.");
        else if (index < 0 || index >= array.length)
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        return this.array[index];
    }

    public int getSize () {
        return this.array.length;
    }

    // method for removing an element by index from a container.
    public T remove (int index) throws UnacceptableValueException{
        if (index < 0 || index >= array.length)
            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
        T removedItem = this.array[index];
        T[] array2 = (T[]) Array.newInstance(Tclass, this.array.length - 1);
        System.arraycopy(array,0, array2, 0, index);
        System.arraycopy(array, index + 1, array2, index, array.length - 1 - index);
        this.array = array2;
        addedSize--;
        return removedItem;
    }

//    2-nd option to remove element from an Array:
//    public T remove(int index) throws UnacceptableValueException{
//         if (index < 0 || index >= array.length)
//            throw new UnacceptableValueException("Index cannot be less than 0 or ignore the size of the container");
//
//        // working principle is shown below:
//        // T[] this.array = {obj1,obj2,obj3,obj4,obj5,obj6};
//        // T[] array2 =     {obj1,obj2,obj4,obj5,obj6,0};
//
//        T removedItem = this.array[index];
//
//        // We create an empty array of size 1 smaller than the original array, since we are removing 1 element
//        T[] array2 = (T[]) Array.newInstance(Tclass, this.array.length - 1);
//
//        int shift = 0; // variable to offset values after removing
//
//        for (int i = 0; i < this.array.length; i++) {
//            if (i != index) {
//                array2[i - shift] = this.array[i];
//            } else {
//                shift++;
//            }
////            as another option, where we can make an offset without the "shift" variable
////            if (i != index) {
////                int newIndex = i < index ? i : i-1;
////                array2[newIndex] = array[i];
////            }
//        }
//        this.array = array2;
//        addedSize--;
//        return removedItem;
//    }

    @Override
    public String toString(){
        return Arrays.toString(this.array);
    }
}




