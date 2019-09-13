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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HELLO WORD");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Họ và Tên:");
        String hoTen = scanner.nextLine();
        
        System.out.println("Điểm TB:");
        double diemTB = scanner.nextDouble();
        System.out.println("Tên: "+hoTen+" Điểm: "+ diemTB);
        
        
                
        
        
        
        // TODO code application logic here
    }
}
