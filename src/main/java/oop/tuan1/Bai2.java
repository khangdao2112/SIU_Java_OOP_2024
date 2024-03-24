package oop.tuan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Tao bien
        int maSV;
        String hoTen;
        int tuoi;
        int namSinh;
        float diemTB;

        //Nhap cac thong tin
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Nhap ma sv: ");
        maSV = sc.nextInt();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.next();
        sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhap diem trung binh: ");
        diemTB = sc.nextFloat();

        //Xuat cac thong tin
        System.out.println("Ma sv: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTB);
    }
}
