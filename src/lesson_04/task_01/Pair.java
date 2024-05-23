package lesson_04.task_01;

//Создайте класс Pair, который будет представлять пару значений любого типа.
public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    // метод для получения первого элемента пары.
    public T getFirst(){
        return this.first;
    }
    // метод для получения второго элемента пары.
    public U getSecond(){
        return this.second;
    }
    // метод для установки значения первого элемента пары.
    public void setFirst(T first){
        this.first = first;
    }
    // метод для установки значения второго элемента пары.
    public void setSecond(U second){
        this.second = second;
    }
}
