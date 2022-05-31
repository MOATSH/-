package userinterface;

import algorithm.User;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class Gui2 extends JFrame{
    private User user;
    private Gui1 gui1;

    public void setUser(User user) {
        this.user = user;
    }

    private JLayeredPane jl = new JLayeredPane();

    private JPanel jp0 = new JPanel();
    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();

    private JButton bt0,bt1,bt2,bt3;

    private JTextField  jt = new JTextField(20);

    private JPasswordField jw = new JPasswordField(20);
    public Gui2 (){
        JLabel background_label = new JLabel(Gui1.image0);
        jp0.setBounds(0,0,Gui1.image0.getIconWidth(),Gui1.image0.getIconHeight());
        jp0.add(background_label);

        bt0 = new JButton("账号");
        bt1 = new JButton("密码");
        bt2 = new JButton("登录");
        bt3 = new JButton("返回");
        bt0.setBounds(0,130,180,30);
        bt0.setBorder(null);
        bt0.setForeground(Color.white);
        bt0.setContentAreaFilled(false);
        bt0.setFont(Gui1.f0);
        bt1.setBorder(null);
        bt1.setBounds(0,230,180,30);
        bt1.setForeground(Color.white);
        bt1.setContentAreaFilled(false);
        bt1.setFont(Gui1.f0);
        bt2.setBounds(5,380,180,50);
        bt2.setForeground(Color.white);
        bt2.setContentAreaFilled(false);
        bt2.setFont(Gui1.f0);
        jt.setBounds(0,170,200,40);
//        jt.setBorder(null);
        jt.setFont(Gui1.f1);
        jw.setFont(Gui1.f1);
        jw.setBounds(0,270,200,40);
//        jw.setBorder(null);
        jw.setEchoChar('*');
        jp1.setBounds(500,200,200,500);
        jp1.setLayout(null);
        jp1.add(jt);
        jp1.add(jw);
        jp1.add(bt0);
        jp1.add(bt1);
        jp1.add(bt2);
        jp1.setBackground(null);
        jp1.setOpaque(false);


        bt3.setFont(Gui1.f1);
        bt3.setForeground(Color.black);
        bt3.setContentAreaFilled(false);
        bt3.setBounds(0,0,150,50);
        bt3.addActionListener(e ->{
            setVisible(false);
            gui1.update();
            gui1.setVisible(true);
        });
        jp2.setLayout(null);
        jp2.setBackground(null);
        jp2.setOpaque(false);
        jp2.setBounds(0,20,200,100);
        jp2.add(bt3);

        bt2.addActionListener(e->{
            JOptionPane.showMessageDialog(this,"连接失败！","Error",JOptionPane.PLAIN_MESSAGE);
        });

        jl.add(jp0,JLayeredPane.DEFAULT_LAYER);
        jl.add(jp1,JLayeredPane.MODAL_LAYER);
        jl.add(jp2,JLayeredPane.MODAL_LAYER);

        this.setTitle("getrichsimultor");
        this.setLayeredPane(jl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(650,300,Gui1.image0.getIconWidth(),Gui1.image0.getIconHeight());
        this.setIconImage(Gui1.image1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT));
        this.setResizable(false);
    }

    public void setGui1(Gui1 gui1){
        this.gui1 = gui1;
    }

    public static void main (String[] args){
        Gui2 gui2 = new Gui2();
        gui2.setVisible(true);
    }
}
