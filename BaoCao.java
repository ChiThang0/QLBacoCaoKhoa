/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbaocaokhoacntt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class BaoCao {

    /**
     * @return the ngayBaoCao
     */
    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    /**
     * @return the demBaoCao
     */
    public static int getDemBaoCao() {
        return demBaoCao;
    }

    /**
     * @param aDemBaoCao the demBaoCao to set
     */
    public static void setDemBaoCao(int aDemBaoCao) {
        demBaoCao = aDemBaoCao;
    }

    /**
     * @return the d
     */
    public static SimpleDateFormat getD() {
        return d;
    }

    /**
     * @param aD the d to set
     */
    public static void setD(SimpleDateFormat aD) {
        d = aD;
    }

    /**
     * @return the maBaoCao
     */
    public int getMaBaoCao() {
        return maBaoCao;
    }

    /**
     * @param maBaoCao the maBaoCao to set
     */
    public void setMaBaoCao(int maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    /**
     * @return the tenBaoCao
     */
    public String getTenBaoCao() {
        return tenBaoCao;
    }

    /**
     * @param tenBaoCao the tenBaoCao to set
     */
    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    /**
     * @return the dslink
     */
    public List<String> getDslink() {
        return dslink;
    }

    /**
     * @param dslink the dslink to set
     */
    public void setDslink(List<String> dslink) {
        this.dslink = dslink;
    }

    /**
     * @return the dsSinhVien
     */
    public List<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    /**
     * @param dsSinhVien the dsSinhVien to set
     */
    public void setDsSinhVien(List<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    /**
     * @return the tenGiangVien
     */
    public String getTenGiangVien() {
        return tenGiangVien;
    }

    /**
     * @param tenGiangVien the tenGiangVien to set
     */
    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    /**
     * @return the diemBaoCao
     */
    public double getDiemBaoCao() {
        return diemBaoCao;
    }

    /**
     * @param diemBaoCao the diemBaoCao to set
     */
    public void setDiemBaoCao(double diemBaoCao) {
        this.diemBaoCao = diemBaoCao;
    }
    private static int demBaoCao;
    private static SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
    private Scanner sc = new Scanner(System.in);
    private int maBaoCao;
    private String tenBaoCao;
    private List<String> dslink = new ArrayList<String>();
    private List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    private Date ngayBaoCao;
    private String tenGiangVien;
    private double diemBaoCao = -1;
    
    {
        ++demBaoCao;
        this.maBaoCao = this.demBaoCao;
    }

    public BaoCao() {
    }

    public BaoCao(String tenBaoCao, Date ngayBaoCao, String tenGiangVien) {
        this.tenBaoCao = tenBaoCao;
        this.ngayBaoCao = ngayBaoCao;
        this.tenGiangVien = tenGiangVien;
    }
    
    public BaoCao(String tenBaoCao, String ngayBaoCao, String tenGiangVien) {
        try {
            this.tenBaoCao = tenBaoCao;
            this.ngayBaoCao = d.parse(ngayBaoCao);
            this.tenGiangVien = tenGiangVien;
        } catch (ParseException ex) {
            System.out.println("loi nhap ngay bao cao" + ex);
        }
    }
    
    public void nhapDiemBaoCao(Scanner sc){
        System.out.println("Nhap diem cua bao cao:");
        this.setDiemBaoCao(Double.parseDouble(sc.nextLine()));
    }
    
    public void themLink(Scanner sc){
        int soLuongLink;
        System.out.println("Nhap so luong link: ");
        soLuongLink = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soLuongLink; i++) {
            String a = "";
            System.out.println("Nhap link: ");
            a = sc.nextLine();
            this.dslink.add(a);
        }
    }
    
    public void themSinhVien(Scanner sc){
        int soLuongSinhvien;
        System.out.println("Nhap so luong SV: ");
        soLuongSinhvien = sc.nextInt();
        if(soLuongSinhvien <= 2 && soLuongSinhvien > 0){
            for (int i = 0; i < soLuongSinhvien; i++) {
                SinhVien sv = new SinhVien();
                sv.nhapSinhVien(sc);
                this.dsSinhVien.add(sv);
            }
        }
        else{
            System.err.println("Moi bao cao co toi da 2 Sinh Vien");
        }
    }
    
    public void themSinhVien(SinhVien sv){
        if(this.dsSinhVien.size() < 2){
            this.dsSinhVien.add(sv);
        }
        else{
            System.err.println("Moi bao cao co toi da 2 Sinh Vien");
        }
    }
    
    public void nhapBaoCao(Scanner sc){
        try {
            System.out.println("Ten bao cao: ");
            this.setTenBaoCao(sc.nextLine());
            System.out.println("Ngay bao cao(dd/MM/yyyy): ");
            this.setNgayBaoCao(d.parse(sc.nextLine()));
            System.out.println("Nhap ten giang vien: ");
            this.setTenGiangVien(sc.nextLine());
            themLink(sc);
            themSinhVien(sc);
        } catch (ParseException ex) {
            System.err.println("Loi nhap ngay bao cao!");
        }
    }
    
    public String getLink(){
        String s = "";
        for(int i = 0; i < this.dslink.size(); i++){
            s = s.concat(this.dslink.get(i));
            s = s.concat("\n");
        }
        return s;
    }
    
    public String getListNameSinhVien(){
        String s ="";
        for(int i = 0; i < this.dsSinhVien.size(); i++){
            s = s.concat(this.dsSinhVien.get(i).getHoTen());
            s = s.concat("\n");
        }
        return s;
    }
    
    @Override
    public String toString(){
        String s = String.format("""
                          Ma bao cao: %d
                          Ten bao cao: %s
                          Ngay bao cao: %s
                          Ten giang vien: %s
                          Danh sach sinh vien: \n%sDanh sach link: \n%s""", 
                this.getMaBaoCao(), this.getTenBaoCao(), d.format(this.getNgayBaoCao()), 
                this.getTenGiangVien(), this.getListNameSinhVien(), this.getLink());
        if(this.diemBaoCao != -1){
            String diem = String.format("Diem bao cao: %.2f\n", this.getDiemBaoCao());
            s = s.concat(diem);
        }
        return s;
    }
}
