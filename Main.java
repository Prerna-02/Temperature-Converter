import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class App extends JFrame
{

Container c;
JLabel labTitle,labDeg,labFah;
JTextField txtdeg,txtfah;
JButton btndeg,btnfah;

App()
{
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.PINK);

labTitle=new JLabel("Temperature Converter App");
labDeg=new JLabel("Enter temp in celsius");
txtdeg=new JTextField(10);
btndeg=new JButton("Convert to Fahrenheit");

labFah=new JLabel("Enter temp in fahrenheit");
txtfah=new JTextField(10);
btnfah=new JButton("Convert to Celsius");

Font f=new Font("Arial",Font.BOLD,30);
labTitle.setFont(f);
labDeg.setFont(f);
txtdeg.setFont(f);
btndeg.setFont(f);
labFah.setFont(f);
txtfah.setFont(f);
btnfah.setFont(f);


labTitle.setBounds(450,50,400,50);
labDeg.setBounds(150,140,350,50);
txtdeg.setBounds(530,140,350,50);
btndeg.setBounds(400,230,350,50);
labFah.setBounds(150,330,350,50);
txtfah.setBounds(530,330,350,50);
btnfah.setBounds(400,420,350,50);

c.add(labTitle);
c.add(labDeg);
c.add(txtdeg);
c.add(btndeg);
c.add(labFah);
c.add(txtfah);
c.add(btnfah);


ActionListener a1=(ae)->{
try
{
double temp=Double.parseDouble(txtdeg.getText());
double res=(temp*9/5)+32;
String msg="Temp in Fahrenheit = "+String.format("%.2f",res);
JOptionPane.showMessageDialog(c,msg);
txtdeg.setText("");
txtdeg.requestFocus();
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(c,"enter numbers only");
txtdeg.setText("");
txtdeg.requestFocus();
}
};
btndeg.addActionListener(a1);


ActionListener a2=(ae)->{
try
{
double temp=Double.parseDouble(txtfah.getText());
double res=(temp-32)*5/9;
String msg="Temp in Celsius = "+String.format("%.2f",res);
JOptionPane.showMessageDialog(c,msg);
txtfah.setText("");
txtfah.requestFocus();
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(c,"enter numbers only");
txtfah.setText("");
txtfah.requestFocus();
}
};
btnfah.addActionListener(a2);


setTitle("Temperature Converter");
setSize(1000,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class Main
{
public static void main(String args[])
{
App a=new App();
}
}
