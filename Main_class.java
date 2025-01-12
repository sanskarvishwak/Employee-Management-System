package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main_class extends JFrame {
         Main_class(){

             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
             Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel img = new JLabel(i3);
             img.setBounds(0,0,1120,630);
             add(img);

              JLabel heading = new JLabel("Employee management System");
              heading.setBounds(340,155,400,40);
              heading.setFont(new Font("Raleway", Font.BOLD,25 ));
              img.add(heading);


              JButton add= new JButton( "Add Employee");
              add.setBounds(335,270,150,40);
              add.setForeground(Color.WHITE);
              add.setBackground(Color.black);
              add.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      setVisible(false);
                      new AddEmployee();
                  }
              });
              img.add(add);

             JButton add1= new JButton( "View  Employee");
             add1.setBounds(535,270,150,40);
             add1.setForeground(Color.WHITE);
             add1.setBackground(Color.black);
             add1.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     setVisible(false);
                     new View_Employee();
                 }
             });
             img.add(add1);

             JButton add2= new JButton( "Remove Employee");
             add2.setBounds(445,180,150,40);
             add2.setForeground(Color.WHITE);
             add2.setBackground(Color.black);
             add2.addActionListener(new ActionListener() {
                 @Override
                  public void actionPerformed(ActionEvent e) {

                  setVisible(false);
                  new RemoveEmployee();
                 }
             });
             img.add(add2);

             setSize(1120,630);
             setLocation(250,100);
             setLayout(null);
             setVisible(true);

         }
    public static void main(String[] args) {
        new Main_class();
    }

}
