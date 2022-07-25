import javax.swing.*;
import java.io.*;
public class g{
    static int l=0;
    static JFrame f=new JFrame();
    static JLabel j;
    public static void g(){
        f.getContentPane().removeAll();
        l=0;
        init();
        
        try{

            BufferedReader b=new BufferedReader(new FileReader("README.txt"));
            int d;
            String s;
            while((s=b.readLine())!=null){
                j=new JLabel(s);
                f.getContentPane().add(j);
                j.setBounds(0,l,s.length()*16,16);
                l=l+16;
            }
        }catch(Exception e){

        }
    }
    public static void init(){
        f.setTitle("HELP");
        f.setLayout(null);
        f.setSize(200,200);
        f.setIconImage(new ImageIcon("icon.png").getImage());
        f.setVisible(true);
    }
}