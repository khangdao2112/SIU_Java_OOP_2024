package oop.tuan3.bai3;

public class Bai3 {
    public static void main(String[] args) {
        Coordinate coord1 = new Coordinate();
        coord1.input();
        coord1.output();
        Coordinate coord2 = new Coordinate(2,3);
        coord2.output();
        Coordinate coord3 = coord2;
        coord3.output();
        System.out.println("Doi xung cua toa do x = " + coord3.getX() + " va y = " + coord3.getY() + " la: ");
        Coordinate coord3Symmetric = coord3.symmetry(coord3);
        coord3Symmetric.output();
    }
}
