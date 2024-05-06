package oop.tuan3.bai2;

public class Bai2 {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        p1.output();
        PhanSo p2 = new PhanSo(4,16);
        p2.output();
        PhanSo p3 = new PhanSo();
        p3.input();
        p3.output();
        PhanSo psCong = new PhanSo(p1.addition(p3));
        psCong.output();
        PhanSo p4 = new PhanSo(psCong);
        PhanSo psNhan = new PhanSo(p4.multiplication(p2));
        psNhan.output();
    }
}
