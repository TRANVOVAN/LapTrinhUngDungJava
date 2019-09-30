
package Tuan_2;

//Thực hành về BorderLayout//

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bai_4 extends JFrame{
    public bai_4(){
        super("Lap Bai 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.RED);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.RED);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest,BorderLayout.WEST);
        
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast,BorderLayout.EAST);
        
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        
        Container con=getContentPane();
        con.add(pnBorder);
            
            
    }
    public static void main(String[] args) {
        bai_4 ui=new bai_4();
        ui.setSize(500, 400);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    
}
