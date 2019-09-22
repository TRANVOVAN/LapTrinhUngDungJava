/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyWidow extends JFrame {
    public MyWidow()
    {
        super("Demo Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //ho tro dong vao tat chuong trinh
     
         JPanel jpn= new JPanel();
       jpn.setLayout(new FlowLayout()); //tạo ra kiểu đội hình FlowLayout
       jpn.setBackground(Color.blue); //để tạo màu cho cửa sổ
       JButton btn1= new JButton("FlowLayout");
       JButton btn2= new JButton("Add các control");
       JButton btn3= new JButton("Trên 1 dòng");
       JButton btn4= new JButton("Hết chỗ chứa");
       JButton btn5= new JButton("Thi Xuống dòng");
       jpn.add(btn1);
       jpn.add(btn2);
       jpn.add(btn3);
       jpn.add(btn4);
       jpn.add(btn5);
       Container con = getContentPane();
       con.add(jpn);
    }
    

    public static void main(String[] args) {
       MyWidow ui= new MyWidow();
       ui.setSize(500,400);
       ui.setLocationRelativeTo(null); //dinh vi cua so o giua man hinh
       ui.setVisible(true); 
       
    }
}  
 
