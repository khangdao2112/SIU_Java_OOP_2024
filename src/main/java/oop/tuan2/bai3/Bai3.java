package oop.tuan2.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //init object
        DanhSachHocSinh ds = new DanhSachHocSinh();

        //input output
        ds.input();
        System.out.println();
        ds.output();

        //sort giam dan theo diem trung binh
        ds.sortDesending();
        System.out.println("\nDanh sach hoc sinh sau khi sort giam dan theo diem trung binh: ");
        ds.output();

    }
}
