package oop.tuan2.bai3;

import java.util.Scanner;

public class HocSinh {
    //attributes
    private int maSo;
    private String hoTen;
    private float diemTB;

    //setters
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    //getters
    public int getMaSo() {
        return maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public float getDiemTB() {
        return diemTB;
    }

    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Nhap thong tin: ");
        System.out.println("Ma so: ");
        this.maSo = sc.nextInt();
        System.out.println("Ho ten: ");
        this.hoTen = sc.next();
        sc.nextLine();
        System.out.println("Diem trung binh: ");
        this.diemTB = sc.nextFloat();
    }

    public void output() {
        System.out.println("Thong tin hoc sinh: ");
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Diem trung binh: " + this.diemTB);
    }

    public void rank() {
        if (this.diemTB < 5) {
            System.out.println("Hoc sinh yeu");
        } else if (this.diemTB < 7) {
            System.out.println("Hoc sinh trung binh");
        } else if (this.diemTB < 8) {
            System.out.println("Hoc sinh kha");
        } else
            System.out.println("Hoc sinh gioi");
    }
}
