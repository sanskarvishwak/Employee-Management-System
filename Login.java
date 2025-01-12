package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    //acctionlistener is used work button functionality if it gives error override the
    // actionperform in th up of driver class.

    JTextField tusername;//declare Jtextfeild

    JPasswordField tpassword;//declare Jtextfeild

    JButton login, back;

    Login(){//constructor name is same according to our class name



         //Username
        JLabel username =new JLabel("UserName");
        username.setBounds(40,20 ,100 ,30);
        add(username);

        //to connect password to jlabel Password
        tusername  =new JTextField("Username");
        tusername.setBounds(150,20,150,30);
        add(tusername);


        //Password
        JLabel password =new JLabel("Password");
        password.setBounds(40,70 ,100 ,30);
        add(password);

        tpassword =new JPasswordField();
        tpassword.setBounds( 150,70,150,30);
        add(tpassword);

        //login button code and i also declared globally in this code
         login =new JButton("LOGIN");
         login.setBounds(150,140,150,30);
         login.setBackground(Color.black);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);

        //back button code and i also declared globally in this code
        back =new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i11 =new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22 =i11.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        ImageIcon i33 =new ImageIcon(i22);
        JLabel imgg= new JLabel(i33);
        imgg.setBounds(350,10,600,350);
        add(imgg);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 =i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel img= new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);


        setSize(600,300);
       setLocation(500,200);
       setLayout(null);
       setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
 //jab bhi humara button par click hoga to wo hume pata chaljaega or pata chalke aajaega humare action event e ke under
  //isliye humne login or baCK BUTTON parr i applied the actionperformed.
        if(e.getSource()== login){//e ke under jo bhi value stor hui hai use hum nikalenge getSource se aggar vo value
            // equal hoti hai humari likhi hui value seto hum if ke unnder jo bhi condition denge wo true ho jaegi.
            try {
                   String username = tusername.getText();
                   String password = tpassword.getText();

                   Conn Conn =new Conn();

                   String query = "select *from login where username = '"+username+"' and password= '"+password+"'";
                ResultSet resultSet =Conn.statement.executeQuery(query);
                //agr data aaya hai to wo next me aa jaega.
                if(resultSet.next()){
                 setVisible(false);
                 new Main_class();

                }else{
                       JOptionPane.showMessageDialog(null,"Invalid username or password");
                }

            }catch (Exception E){
              E.printStackTrace();
            }

        } else if (e.getSource()== back) {
            System.exit(90);//this will take us out of the project.give any integer value in that small brackets,
        }
    }

    public static void main(String[] args) {
      new Login();//object of Login constructor

    }
}
