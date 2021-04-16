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
public class tester {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyen van A", "K15", "Nam", 1999, "KKHMT");
        SinhVien sv2 = new SinhVien("Nguyen thi B", "K15", "Nu", 1999, "HHTTQL");
        SinhVien sv3 = new SinhVien("Le thi C", "K6", "Nu", 1998, "HHTTQL");
        
        BaoCao bc = new BaoCao("Bao cao 1", "20/12/2020", "Nguyen Van D");
        bc.themSinhVien(sv1);
        bc.themSinhVien(sv2);
        bc.themLink(sc);
        bc.nhapDiemBaoCao(sc);
        System.out.println("Xuat bao cao");
        System.out.println(bc.toString());
    }
}
