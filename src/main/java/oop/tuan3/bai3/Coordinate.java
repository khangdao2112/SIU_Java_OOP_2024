package oop.tuan3.bai3;

import java.util.Scanner;

public class Coordinate {
    public float x;
    public float y;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Coordinate(Coordinate coord){
        this.x = coord.x;
        this.y = coord.y;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        this.x = sc.nextFloat();
        System.out.println("Nhap y: ");
        this.y = sc.nextFloat();
    }

    public void output() {
        System.out.println("x: " + this.x + " ,y: " + this.y);
    }

    public Coordinate symmetry(Coordinate coord) {
        Coordinate temp = new Coordinate();
        temp.x = coord.x * -1;
        temp.y = coord.y * -1;
        return temp;
    }
}
