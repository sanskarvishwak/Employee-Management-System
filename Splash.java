package employee.management.system;


import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {


    Splash(){//constructor - it is according to class name
          //yha pe hum frame ka size set krne par

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));//IMAGE lagane ke liye hum ise use krte h.
        Image i2 =i1.getImage().getScaledInstance(1170, 650 , Image.SCALE_DEFAULT);//Image i1 ko i2 me store kr denge. image ko size ke according scale krna hota h
        //Image ko hum direct frame par ni leja skte isliye image ko frame pe le jane ke liye.
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image  =new JLabel(i3);
        image.setBounds(0,0, 1170, 650 );
        add(image);


        setSize(1170, 650);
        setLocation(400 ,50 );//frame ki location set karne ke liye hum use krte h.x,y position
        setLayout(null);
        setVisible(true);// frame visible karne ke liye.

        //frame ko multifunction karne ke liye hume use karna padega thread ka
        try{
            Thread.sleep(5000);//we have to use our frame 5 seconds
            setVisible(false);//yha pe hume 5 second ke baad bnd krna h frame
            new Login();//this will take us From Employee management page to Login Page
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Splash();// object of constructor jo ki main function ander banaya hai.

    }
}
