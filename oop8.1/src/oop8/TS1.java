package oop8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TS1 extends JFrame{

	private static final long serialVersionUID = 1L;
	JTextField f1, f2, f3,f4;
    JButton b1,b2;
    static int n,r;
    static double a,x;
   
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame fr = new JFrame();
        fr.setSize(715, 150);  
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        JButton b1 = new JButton("Вариант 1");
        JButton b2 = new JButton("Вариант 2");
        final JTextField f1 = new JTextField(10);
        final JTextField f2 = new JTextField(10);
        final JTextField f3 = new JTextField(10);
        final JTextField f4 = new JTextField(10);
        final JTextField f5 = new JTextField(40);
    	JLabel l1 = new JLabel("N:");
    	JLabel l2 = new JLabel("R:");
    	JLabel l3 = new JLabel("a:");
    	JLabel l4 = new JLabel("x:");
    	JLabel l5 = new JLabel("Z=");
        fr.add(l1);
        fr.add(f1);
        fr.add(l2);
        fr.add(f2);
        fr.add(l3);
        fr.add(f3);
        fr.add(l4);
        fr.add(f4);
        fr.add(b1);
        fr.add(b2);
        fr.add(l5);
        fr.add(f5);
 
        b1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 n = Integer.parseInt(f1.getText());
                 x = Double.parseDouble(f4.getText());
                 
                  f5.setText("" + (make1(n,x)));
            }
        });
        
        b2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 n = Integer.parseInt(f1.getText());
                 r = Integer.parseInt(f2.getText());
                 a = Double.parseDouble(f3.getText());
                 x = Double.parseDouble(f4.getText());
                 
                  f5.setText("" + (make2(n,r,a,x)));
            }
        });
        
    }
    
    public static double make1(int n, double x) {
		double res=0;
		int st=0,zn=2, kf=1;
		double ch=1;
		for(int i = 0;i<n;i++) {
			ch=Math.pow(x, st)*(-1);
			zn=zn*kf;
			res+=ch/zn;
			st++;
			kf++;
		}
		return res;
    	
    }
    public static double make2(int n, int r, double a, double x) {
		double res=0;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 0;j<=r;j++) {
				res+=(a*i)/(Math.pow(i,3)+Math.pow(j,3));
			}
		}
		return res;
    }
}