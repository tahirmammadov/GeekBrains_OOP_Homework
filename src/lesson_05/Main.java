package lesson_05;

import lesson_05.controller.Controller;
import lesson_05.service.StudyGroupService;
import lesson_05.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.clickCreate(new View<>(), new StudyGroupService());
    }
}
