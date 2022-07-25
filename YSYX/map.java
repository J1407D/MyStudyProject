import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
public class map implements KeyListener{
    public static JFrame MAP_FRAME=new JFrame();
    int x=0;
    int y=0;
    JLabel jl=new JLabel(new ImageIcon("b.jpeg"));
    public void showMap(){
        Init();
        jl.setBounds(0,0,2000,1516);
        MAP_FRAME.addKeyListener(this);
        MAP_FRAME.setIconImage(new ImageIcon("icon.png").getImage());
        MAP_FRAME.setVisible(true);
    }
    public static void Init(){
        MAP_FRAME.setSize(600,600);
        MAP_FRAME.setTitle("MAP");
        MAP_FRAME.setLayout(null);
    }
    public void keyPressed(KeyEvent e){
        int code =e.getKeyCode();
        MAP_FRAME.getContentPane().removeAll();
        if(code==65){
            x=x+10;
        }else if(code==68){
            x=x-10;
        }else if(code==83){
            y=y-10;
        }else if(code==87){
            y=y+10;
        }else{
            x=x;
            y=y;
        }
        MAP_FRAME.getContentPane().add(jl);
        jl.setBounds(x,y,2000,1516);
        MAP_FRAME.getContentPane().repaint();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}