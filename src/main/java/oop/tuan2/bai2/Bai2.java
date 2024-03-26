package oop.tuan2.bai2;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        //init object
        Mang mang1 = new Mang();

        //nhap xuat
        mang1.input();
        mang1.output();

        //tinh trung binh so le
        System.out.println("Trung binh tong so le: " + mang1.averageOddNumbers());

        //gia tri lon nhat trong mang
        System.out.println("Gia tri lon nhat: " + mang1.maxValue());

        //sort mang tang dan
        mang1.sortAscending();
        System.out.println("Mang sau khi sort tang dan: " + Arrays.toString(mang1.getArr()));
    }
}
