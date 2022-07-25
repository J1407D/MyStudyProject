import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pm implements MouseListener{
    JButton jb=new JButton(new ImageIcon("pm.PNG"));
    JButton[] jbs={
    new JButton("Team SET"),
    new JButton("Friends"),
    new JButton("Mark"),
    new JButton("Character"),
    new JButton("Bag"),
    new JButton("Map"),
    new JButton("Something Important")};
    
    public static JFrame pmf=new JFrame();
    public void mouseClicked(MouseEvent e){
        init();
        for(int i=0;i<7;i++){
            pmf.getContentPane().add(jbs[i]);
            jbs[i].setBounds(0,i*70,300,70);
        }
        pmf.setVisible(true);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void showPaimon(){
        KACT.jf.getContentPane().add(jb);
        jb.setBounds(0,0,25,25);
        jb.addMouseListener(this);
    }
    public static void init(){
        pmf.setSize(500,500);
        pmf.setLayout(null);
        pmf.setIconImage(new ImageIcon("pm.PNG").getImage());
    }
    public void showa(){
        mouseClicked(null);
    }
}