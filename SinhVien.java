/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbaocaokhoacntt;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class SinhVien {

    /**
     * @return the maSinhVien
     */
    public int getMaSinhVien() {
        return maSinhVien;
    }

    /**
     * @param maSinhVien the maSinhVien to set
     */
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the khoaHoc
     */
    public String getKhoaHoc() {
        return khoaHoc;
    }

    /**
     * @param khoaHoc the khoaHoc to set
     */
    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the namSinh
     */
    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the chuyenNganh
     */
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    /**
     * @param chuyenNganh the chuyenNganh to set
     */
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    private static int dem;
    private int maSinhVien;
    private String hoTen;
    private String khoaHoc;
    private String gioiTinh;
    private int namSinh;
    private String chuyenNganh;
    private Scanner sc = new Scanner(System.in);

    {
        ++dem;
        this.maSinhVien = this.dem;
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen, String khoaHoc, String gioiTinh, int namSinh, String chuyenNganh) {
        this.hoTen = hoTen;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }

    public void nhapSinhVien(Scanner sc) {
        System.out.println("HoTen: ");
        this.setHoTen(sc.nextLine());
        System.out.println("Khoa hoc: ");
        this.setKhoaHoc(sc.nextLine());
        System.out.println("gioiTinh: ");
        this.setGioiTinh(sc.nextLine());
        System.out.println("namSinh: ");
        this.setNamSinh(Integer.parseInt(sc.nextLine()));
        System.out.println("chuyenNganh: ");
        this.setChuyenNganh(sc.nextLine());
    }

    @Override
    public String toString() {
        String s = null;
        s = String.format("Ma SV: %d\nHoTen: %s\nKhoa hoc: %s\nGioiTinh: %s\nNamSinh: %d\nChuyenNganh: %s\n",
                this.getMaSinhVien(), this.getHoTen(), this.getKhoaHoc(), this.getGioiTinh(), this.getNamSinh(), this.getChuyenNganh());
        return s;
    }
}
