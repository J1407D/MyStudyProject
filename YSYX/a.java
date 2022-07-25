import javax.swing.*;
public class a implements act{
    ImageIcon anb37=new ImageIcon("Amber\\anb37.png");
    ImageIcon anb38=new ImageIcon("Amber\\anb38.png");
    ImageIcon anb39=new ImageIcon("Amber\\anb39.png");
    ImageIcon anb40=new ImageIcon("Amber\\anb40.png");
    ImageIcon anbf37=new ImageIcon("Amber\\anbf37.png");
    ImageIcon anbf38=new ImageIcon("Amber\\anbf38.png");
    ImageIcon anbf39=new ImageIcon("Amber\\anbf39.png");
    ImageIcon anbf40=new ImageIcon("Amber\\anbf40.png");
    JLabel jae65=new JLabel(anb37);
    JLabel jae83=new JLabel(anb40);
    JLabel jae68=new JLabel(anb39);
    JLabel jae87=new JLabel(anb38);
    JLabel jaef37=new JLabel(anbf37);
    JLabel jaef38=new JLabel(anbf38);
    JLabel jaef39=new JLabel(anbf39);
    JLabel jaef40=new JLabel(anbf40);
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