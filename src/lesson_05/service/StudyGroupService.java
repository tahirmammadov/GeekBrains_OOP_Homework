package lesson_05.service;

import lesson_05.entity.*;

import java.util.*;

public class StudyGroupService {
    public StudyGroup create(Teacher teacher, List<Student> students){

        return new StudyGroup(teacher, students);
    }
}
