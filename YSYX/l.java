import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
public class l {
	Scanner s = new Scanner(System.in);
	String t;
	File l=null;
	File fl=new File("Users");
	FileInputStream fi=null;
	FileOutputStream fo=null;
	u u1=new u();
	public l() {
		try {
			l=new File("Users");
			if(!l.exists()) {
				l.mkdir();
			}
		}catch(Exception e) {
			
		}
	}
	
	public void Login(String t,String u,String p) throws Exception{
		switch(t) {
		case "z":
			login(u,p);
			break;
		case "login":
			z(u,p);
			break;
		
		case "exit":
			return;
		}
	}
	public String login(String t,String p) throws UException {
		File fu=new File("Users/"+t);
		if(!fu.exists()) {
			fu.mkdir();
		}
		try {
			fo=new FileOutputStream("Users/"+t+"/"+t+".uxt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}// TODO unhealthily unused useless used useful useless unused using uses
		//System.out.println("Enter Password");
		//t=s.next();
		char[] tc=p.toCharArray();
		if(tc.length<8) {
			throw new UException("This password is too SHORT or too EASY!");
		}
		byte[] te=toByteArray(tc);
		try {
			fo.write(te);
			fo.flush();
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		return "Successed";
	}
	public byte[] toByteArray(char[] a) {
		byte[] b=new byte[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=(byte)a[i];
		}
		return b;
	}
	public String  z(String t,String p) {
		//System.out.println("Enter User Name:");
		//t=s.next();
		int r=0;
		try {
			fi=new FileInputStream("Users/"+t+"/"+t+".uxt");
			//System.out.println("Enter password:");
			//t=s.next();
			char[] tc=p.toCharArray();
			byte[] tb=toByteArray(tc);
			byte[] td=new byte[tb.length];
			
			try {
				while((td[r]=(byte) fi.read())!=-1) {
					if(r==td.length-1)
						break;
					r++;
				}
				if(byteArrayEquals(tb,td)) {
					return "Welcome";
				}else {
					return "Duang";
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		}
		return "Wlcm";
	}
	public boolean byteArrayEquals(byte[] a,byte[] b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				
			}else {
				return false;
			}
		}
		return true;
	}
}
