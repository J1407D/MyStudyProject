import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class login implements MouseListener{
    static JButton jb=new JButton("login");
    static JButton jb2=new JButton("ZHUCE");
    static JFrame jf=new JFrame("Launch");
    static JTextField jt=new JTextField(16);
    static JTextField jt2=new JTextField(16);
    static JLabel jl =new JLabel("NAME:");
    static JLabel jl2=new JLabel("PASSWORD");
    static JButton dlu=new JButton(new ImageIcon("dl2.png"));

    public login(){}
    public static void init(){
        jf.setSize(400,400);
        jf.setLayout(null);
    }
    public void showl(){
        KACT.jf.getContentPane().add(dlu);
        dlu.setBounds(30,0,60,27);
        dlu.addMouseListener(this);
    }
    public void show(){
        init();
        jf.getContentPane().add(jb);
        jb.setBounds(100,200,50,50);
        jf.getContentPane().add(jb2);
        jb2.setBounds(210,200,50,50);
        jf.getContentPane().add(jt);
        jt.setBounds(110,20,100,20);
        jf.getContentPane().add(jt2);
        jt2.setBounds(110,100,100,20);
        jf.getContentPane().add(jl);
        jl.setBounds(40,20,40,20);
        jf.getContentPane().add(jl2);
        jl2.setBounds(40,120,40,20);
        jb.addMouseListener(new dl());
        jb2.addMouseListener(new zc());
        jf.setVisible(true);
    }
    public String un(){
        return jt.getText();
    }
    public String pn(){
        return jt2.getText();
    }
    public boolean ok(){
        jf.setVisible(false);
        return true;
    }
    public void mouseClicked(MouseEvent e){
        show();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}