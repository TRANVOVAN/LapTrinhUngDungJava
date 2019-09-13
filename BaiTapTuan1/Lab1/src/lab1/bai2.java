/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class bai2 {
    public static void main(String[] args) {
        Double chieuDai,chieuRong,dienTich,chuVi ;
        Scanner voVan = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài ");
        chieuDai = voVan.nextDouble();
        System.out.println("Nhập Chiều Rộng");
        chieuRong = voVan.nextDouble();
        dienTich=chieuDai*chieuRong;
        chuVi=(chieuDai+chieuRong)*2;
        System.out.println("Diện Tích là "+dienTich);
        System.out.println("Chu Vi là "+chuVi);
        
        
    }
  
}
