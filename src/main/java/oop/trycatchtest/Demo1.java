package oop.trycatchtest;

import java.util.*;

class Student {
    private int id;
    private String name;
    private int classNumber;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = null;
        s1 = new Student();
        try {
            s1.setName("Fred");
            s2.setName("Mary");
        } catch (NullPointerException e) {
            System.out.println("Chua tao doi tuong: " + e.getMessage());
        } finally {
            System.out.println("Exited try catch");
        }
    }
}

class Problem4 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = null;
        s1 = new Student();
        try {
            s1.setName("Fred");
            s2.setName("Mary");
        } catch (ArithmeticException e) {
            System.out.println("Catch 1");
        }
    }
}


