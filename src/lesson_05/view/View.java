package lesson_05.view;

import java.util.Scanner;

public class View<T> { // view doesn't know anything about models!
    Scanner scanner = new Scanner(System.in);

    public int getInt(String value){
        System.out.printf("Insert %s: ", value);
        int input = scanner.nextInt();
        scanner.nextLine();//consumes the \n character after scanner.nextInt(), which only reads the int value.;
        return input;
    }

    public String getLine(String value){
        System.out.printf("Insert %s: ", value);
        return scanner.nextLine();
    }

    public String getMoreLines(String value){
        System.out.printf("Press `Enter` to add more %s or press `q` to quit", value);
        return scanner.nextLine();
    }

    public void getResult(String title, T obj){
        System.out.printf("\nCreated new %s:\n%s", title, obj);
    }
}
