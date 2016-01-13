package com.ivik.students.model;

/**
 * Created by Cardoso on 12-Jan-16.
 */
public class Student {

    //this class has 2 fields
    private String name;
    private double score;


    public Student(String name, double score) { // 1 public constructor
        // this is a way of referring to instance variables in a class
        this.name = name;
        this.score = score;
        //System.out.println("My name is " + this.name + " and I scored " + this.score);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {//is this not used?
        this.name = name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //public static void main(String[] args) {
        //Student x = new Student("John", 17.5);
        //Student y = new Student("Karl", 15.3);

        //Student z = new Student();
        //Student w = new Student();
        //z.setName("Sue");
        //z.setScore(14.7);
        //System.out.println("Name: " + z.getName());
        //System.out.println("Score: " + z.getScore());
    //}
}