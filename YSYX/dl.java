import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class dl implements MouseListener{
    static login o=new login();
    l l=new l();
    public void mouseClicked(MouseEvent e){
        String u=o.un();
        String p=o.pn();
        try{
            System.out.println("r");
            l.Login("login",u,p);
            System.out.println("l");
        }catch(Exception j){
            System.out.println("s");
            j.printStackTrace();
        }
        
    }
    static boolean a=o.ok();

    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}