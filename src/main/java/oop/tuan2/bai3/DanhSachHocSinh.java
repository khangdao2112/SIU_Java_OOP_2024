package oop.tuan2.bai3;

import java.util.Scanner;

public class DanhSachHocSinh {
    //attributes
    private HocSinh[] hocSinh;
    private int soLuong;

    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        this.soLuong = sc.nextInt();
        hocSinh = new HocSinh[this.soLuong];
        for (int i = 0; i < hocSinh.length; i++) {
            hocSinh[i] = new HocSinh();
            hocSinh[i].input();
        }
    }

    public void output() {
        System.out.println("Danh sach hoc sinh: ");
        for (int i = 0; i < hocSinh.length; i++) {
            hocSinh[i].output();
        }
    }

    public void sortDesending() {
        HocSinh hocSinhTemp;
        boolean swapped;
        //bubble sort
        for (int i = 0; i < hocSinh.length; i++) {
            swapped = false;
            for (int j = 0; j < hocSinh.length - 1; j++) {
                if (hocSinh[j].getDiemTB() < hocSinh[j+1].getDiemTB()) {
                    hocSinhTemp = hocSinh[j];
                    hocSinh[j] = hocSinh[j+1];
                    hocSinh[j+1] = hocSinhTemp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
