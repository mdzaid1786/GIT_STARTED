import java.awt.*;
import java.awt.event.*;             
class sample extends Frame implements ActionListener,WindowListener{
Label l1, l2,l3;
TextField tf1, tf2, tf3;
 Button b1, b2, b3, b4,b5,b6;
sample() {
l1=new Label("First No:");
 l1.setBounds(10, 60,50, 20);
 tf1 = new TextField();
 tf1.setBounds(60,50, 150, 35);
 l2=new Label("Second:");
 l2.setBounds(10, 100,50,20);
 tf2 = new TextField();
 tf2.setBounds(60, 90, 150, 35);
 l3=new Label("Result:");
 l3.setBounds(10, 140,40, 30);
 tf3 = new TextField();
 tf3.setBounds(60, 140, 150, 35);
 tf3.setEditable(false);
 b1 = new Button("+");
 b1.setBounds(50,200,50, 50);
 b2 = new Button("-");
 b2.setBounds(120,200,50,50);
 b3 = new Button("*");
 b3.setBounds(50, 270, 50, 50);
 b4 = new Button("/");
 b4.setBounds(120,270,50,50);
 b5 = new Button("%");
 b5.setBounds(190,270,50,50);
b6 = new Button("AC");
 b6.setBounds(190,200,50,50);
this.addWindowListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
add(l1);
add(l2);
add(l3);
 add(tf1);
 add(tf2);
 add(tf3);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
add (b5);
add (b6);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 }
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
	dispose();
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
	
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
 public void actionPerformed(ActionEvent e) {
 String s1 = tf1.getText();
 String s2 = tf2.getText();
 double a = Double.parseDouble(s1);
 double b = Double.parseDouble(s2);
 double c = 0.0;
 if (e.getSource() == b2){
 	c = a - b;
 }	
 else if (e.getSource() == b1){
 	c = a + b;
}
 else if (e.getSource() == b4){
 	c = a / b;
}
else if (e.getSource() == b5){
 	c = a % b;
}
 else if (e.getSource() == b3){
 	c = a * b;
 }
else if (e.getSource() == b6){
 	String r ="0";
        tf1.setText(r);
        tf2.setText(r);
}
 	String result = String.valueOf(c);
 	tf3.setText(result);
 }
public static void main(String[] args) {
 	new sample();
	}
 }