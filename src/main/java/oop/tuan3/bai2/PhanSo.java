package oop.tuan3.bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    };
    PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    PhanSo(PhanSo phanSo) {
        this.tuSo = phanSo.tuSo;
        this.mauSo = phanSo.mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }
    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Nhap tu so: ");
        this.tuSo = sc.nextInt();
        do {
            System.out.println("Nhap mau so: ");
            this.mauSo = sc.nextInt();
            if (this.mauSo == 0) {
                System.out.println("Mau so khong duoc bang 0");
            }
        }
        while (this.mauSo == 0);
    }
    public void output() {
        System.out.println("Phan so vua nhap: " + this.tuSo + "/" + this.mauSo);
    }
    public int ucln(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    public void rutGon() {
        int temp = ucln(this.tuSo, this.mauSo);
        this.tuSo/=temp;
        this.mauSo/=temp;
    }
    public PhanSo addition(PhanSo phanSo) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSo.mauSo + this.mauSo * phanSo.tuSo;
        ketQua.mauSo = this.mauSo * phanSo.mauSo;
        ketQua.rutGon();
        return ketQua;
    }
    public PhanSo subtraction(PhanSo phanSo) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSo.mauSo - this.mauSo * phanSo.tuSo;
        ketQua.mauSo = this.mauSo * phanSo.mauSo;
        ketQua.rutGon();
        return ketQua;
    }
    public PhanSo multiplication(PhanSo phanSo) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSo.tuSo;
        ketQua.mauSo = this.mauSo * phanSo.mauSo;
        ketQua.rutGon();
        return ketQua;
    }
    public PhanSo division(PhanSo phanSo) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSo.mauSo;
        ketQua.mauSo = this.mauSo * phanSo.tuSo;
        ketQua.rutGon();
        return ketQua;
    }
}
