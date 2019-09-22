
package Tuan_2;

 //Thực hành cách hiển thị cửa sổ Windows trong Java//
import javax.swing.JFrame;

public class bai_1 extends JFrame
{
 public bai_1()
 {
     super("Lab Bai 1");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
      
 }
 
    public static void main(String[] args) {
        bai_1 ui =new bai_1();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
   
}
