
package Tuan_2;

//Thực hành về FlowLayout//

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bai_2 extends JFrame{
  public bai_2(){
      super("Lab Bai 2");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      JPanel pnFlow=new JPanel();
      pnFlow.setLayout(new FlowLayout());
      pnFlow.setBackground(Color.PINK);
      JButton btn1=new JButton("FlowLayout");
      JButton btn2=new JButton("Add các control");
      JButton btn3=new JButton("Trên 1 dòng");
      JButton btn4=new JButton("Hết chỗ chứa");
      JButton btn5=new JButton("Thì xuống dòng");
      pnFlow.add(btn1);
      pnFlow.add(btn2);
      pnFlow.add(btn3);
      pnFlow.add(btn4);
      pnFlow.add(btn5);
      
      Container con=getContentPane();
      con.add(pnFlow);
        
  }
    public static void main(String[] args) {
        bai_2 ui=new bai_2();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    
}
