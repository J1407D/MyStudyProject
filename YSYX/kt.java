
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KACT implements KeyListener{
    static ImageIcon bk=new ImageIcon("b.jpeg");
    static ImageIcon qu=new ImageIcon("m/k.png");
    static JLabel bck=new JLabel(bk);
    static JLabel que=new JLabel(qu);
    static JFrame jf=new JFrame();
    static int weight=0;
    static int height=0;
    static int z=1;
    static map m=new map();
    static pm p=new pm();
    static login l=new login();
    public static act[] acts={new k(),new a(),new y(),null};
    public void keyTyped(KeyEvent e){
        System.out.println(e.getKeyCode()+"s");
    }
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if(code==49){
            z=1;
        }else if(code==50){
            z=2;
        }else if(code==51){
            z=3;
        }else if(code==52){
            z=4;
        }else if(code==27){
            p.showa();
        }else if(code==71){
            g.g();
        }else if(code==77){
            m.showMap();
        }else if(code==76){
            l.show();
        }else{
            z=z;
        }
        System.out.println(z);
        if(z==1){
            this.acts[0].move(code);
        }else if(z==2){
            this.acts[1].move(code);
        }else if(z==3){
            this.acts[2].move(code);
        }else if(z==4){
        }else{
            System.out.println("ERROR:CAN'T FIND THIS CHARACTER"+code);
        }
        jf.getContentPane().repaint();
    }
    public void keyReleased(KeyEvent e){
        System.out.println(e.getKeyCode()+"RELEASED");
    }
    public void init(){
        this.jf.setSize(500,500);
        this.jf.setTitle("Genshin Impact Game");
        this.jf.setDefaultCloseOperation(3);
        this.jf.setLayout(null);
        this.jf.setFocusable(true);
        this.jf.addKeyListener(this);
        System.out.println("sp");
        p.showPaimon();
        System.out.println("sl");
        System.out.println("si");
        this.jf.setIconImage(new ImageIcon("icon.png").getImage());
        System.out.println("sv");
        System.out.println("ak");
        this.jf.setVisible(true);
        System.out.println("ok");
    }
    public static void inita(){
        KACT f=new KACT();
        f.init();
    }
}