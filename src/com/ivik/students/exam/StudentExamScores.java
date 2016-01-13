package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;

/**
 * Created by Cardoso on 13-Jan-16.
 */
public class StudentExamScores {
    private Student[]students;
    public StudentExamScores() {
        initExamScores();
    }
    private void initExamScores(){
        Student student1 = new Student ("John",17.5);
        Student student2 = new Student ("Karl",15.5);
        Student student3 = new Student ("Sue",14.3);
        Student student4 = new Student ("Albert",10.4);
        Student student5 = new Student ("Peter",18.6);
        Student student6 = new Student ("Zoe",11.8);
        students = new Student[]{student1,student2,student3,student4,student5,student6};
    }
    public void reportStudentScores(){
        SortUtils.sortStudents(students);
        System.out.println("Name      " + "Score");
        System.out.println("------    " + "-----");

        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            double score = students[i].getScore();
            System.out.format("%-10s%-4s%n", name, score);//first column is left justified and has 10 characters
            //second column is left justified and has 4 characters, %n indicates new line for each group
        }
    }
    public static void main (String[]args){
        new StudentExamScores().reportStudentScores();
    }
}
