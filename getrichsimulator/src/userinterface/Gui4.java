package userinterface;

import algorithm.User;

import javax.swing.*;
import java.awt.*;

public class Gui4 extends JFrame {
    public static ImageIcon image0 = new ImageIcon("输.jpg");
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    private JPanel jp = new JPanel();
    private JPanel jp1 = new JPanel();
    private JLayeredPane jlp = new JLayeredPane();
    private JLabel jl;
    private JButton jb;

    public Gui4 (){
        jl = new JLabel(image0);
        jp.setBounds(0,0,472,300);
        jp.add(jl);

        jb = new JButton("Ok");
        jb.setFont(Gui1.f0);
        jb.setForeground(Color.cyan);
        jb.setContentAreaFilled(false);
        jb.setBounds(180,200,100,50);
        jb.addActionListener(e->{
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"你现在有"+user.getTotalAssets()+"钱了！","Message",JOptionPane.PLAIN_MESSAGE);
        });
        jp1.setLayout(null);
        jp1.setBounds(0,0,472,300);
        jp1.setBackground(null);
        jp1.setOpaque(false);
        jp1.add(jb);

        jlp.add(jp,JLayeredPane.DEFAULT_LAYER);
        jlp.add(jp1,JLayeredPane.MODAL_LAYER);

        this.setTitle("");
        this.setLayeredPane(jlp);
        this.setBounds(980,570,472,300);
        this.setIconImage(Gui1.image1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT));
        this.setResizable(false);

    }
}
