package lesson_05.controller;

import lesson_05.entity.*;
import lesson_05.service.StudyGroupService;
import lesson_05.view.View;

import java.util.*;

public class Controller {
    List<Student> students = new ArrayList<>();
    public void clickCreate (View<StudyGroup> view, StudyGroupService studyGroupService){

        int teacherId = view.getInt("teacher id");
        String teacherName = view.getLine("teacher name");

        // creating teacher (создать объект teacher)
        Teacher teacher = new Teacher (teacherId, teacherName);

        // creating student list (создать объекты студентов и включить их в список)


        while(true) {
            int studentId = view.getInt("student id");
            String studentName = view.getLine("student name");

            Student student = new Student(studentId, studentName);
            this.students.add(student);

            String answer = view.getMoreLines("students");
            if(answer.equals("q")){
                break;
            }
        }
        StudyGroup studyGroup = studyGroupService.create(teacher, this.students);
        view.getResult("study group", studyGroup);
    }
}
