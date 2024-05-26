package lesson_05.entity;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public String getStudents(){
        return this.students.toString();
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }

    @Override
    public String toString() {
        return  "teacher=" + teacher + ", students=" + students.toString();
    }
}
