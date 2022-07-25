import javax.swing.*;
public class k implements act{
    ImageIcon keq68=new ImageIcon("Keqing\\keqing39.png");
    ImageIcon keq65=new ImageIcon("Keqing\\keqing37.png");
    ImageIcon keq83=new ImageIcon("Keqing\\keqing40.png");
    ImageIcon keq87=new ImageIcon("Keqing\\keqing38.png");
    ImageIcon keqf37=new ImageIcon("Keqing\\keqingf37.png");
    ImageIcon keqf38=new ImageIcon("Keqing\\keqingf38.png");
    ImageIcon keqf39=new ImageIcon("Keqing\\keqingf39.png");
    ImageIcon keqf40=new ImageIcon("Keqing\\keqingf40.png");
    JLabel jae68=new JLabel(keq68);
    JLabel jae65=new JLabel(keq65);
    JLabel jae83=new JLabel(keq83);
    JLabel jae87=new JLabel(keq87);
    JLabel jaef37=new JLabel(keqf37);
    JLabel jaef38=new JLabel(keqf38);
    JLabel jaef39=new JLabel(keqf39);
    JLabel jaef40=new JLabel(keqf40);
    static int keqt=0;
    static int keqzt=1;
    public void move(int code){
        KACT.jf.getContentPane().removeAll();
        if(code==68){
            KACT.weight=KACT.weight-5;
            KACT.jf.getContentPane().add(rtzt(3));
            keqt=3;
            keqzt=keqt;
        }else if(code==65){
            KACT.weight=KACT.weight+5;
            KACT.jf.getContentPane().add(rtzt(1));
            keqt=1;
            keqzt=keqt;
        }else if(code==87){
            KACT.height=KACT.height+5;
            KACT.jf.getContentPane().add(rtzt(2));
            keqt=2;
            keqzt=keqt;
        }else if(code==83){
            KACT.height=KACT.height-5;
            KACT.jf.getContentPane().add(rtzt(4));
            keqt=4;
            keqzt=keqt;
        }else if(code==32){
            if(keqt==1){
                KACT.jf.getContentPane().add(rtzt(5));
                keqzt=5;
            }else if(keqt==2){
                KACT.jf.getContentPane().add(rtzt(6));
                keqzt=6;
            }else if(keqt==3){
                KACT.jf.getContentPane().add(rtzt(7));
                keqzt=7;
            }else if(keqt==4){
                KACT.jf.getContentPane().add(rtzt(8));
                keqzt=8;
            }else{}
        }else if(code==16){
            if(keqt==1){
                KACT.weight=KACT.weight+80;
                KACT.jf.getContentPane().add(rtzt(keqzt));
            }else if(keqt==2){
                KACT.height=KACT.height+80;
                KACT.jf.getContentPane().add(rtzt(keqzt));
            }else if(keqt==3){
                KACT.weight=KACT.weight-80;
               KACT.jf.getContentPane().add(rtzt(keqzt));
            }else if(keqt==4){
                KACT.height=KACT.height-80;
                KACT.jf.getContentPane().add(rtzt(keqzt));
            }
        }else{
            System.out.println("ERROR:CAN'T FIND THIS CHARACTER"+code);
        }
        rtzt(keqzt).setBounds(200,200,50,75);
        KACT.p.showPaimon();
        KACT.jf.getContentPane().add(KACT.bck);
        KACT.bck.setBounds(KACT.weight,KACT.height,2000,1516);
        KACT.jf.getContentPane().repaint();
    }
    public JLabel rtzt(int zt){
        if(zt==1){
            return jae65;
        }else if(zt==2){
            return jae87;
        }else if(zt==3){
            return jae68;
        }else if(zt==4){
            return jae83;
        }else if(zt==5){
            return jaef37;
        }else if(zt==6){
            return jaef38;
        }else if(zt==7){
            return jaef39;
        }else if(zt==8){
            return jaef40;
        }else return null;
    }
}