package userinterface;

import algorithm.DailyCheckIn;
import algorithm.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui1 extends JFrame {
    JLabel title_jlable = new JLabel("Getrichersilmulator");
    private DailyCheckIn checkIn = new DailyCheckIn();
    private User user;
    private Gui2 gui2;
    private Gui3 gui3;
    //字体
    public static Font f0 = new Font("华文琥珀",Font.PLAIN,30);
    public static Font f1 = new Font("楷体",Font.BOLD,20);
    //按钮
    private JButton jb0,jb1,jb2,jb3,jb4;
    //三个 Jpanel
    private JPanel jp0 = new JPanel();
    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();
    //用于分层Jpanel
    private JLayeredPane jl = new JLayeredPane();
    //存放图片
    public static ImageIcon image0 = new ImageIcon("背景1.jpg");
    public static ImageIcon image1 = new ImageIcon("窗口.jpg");

    public Gui1 (){
        //设置jp0
        this.user = user;
        JLabel background_lable = new JLabel( image0);
        jp0.setBounds(0,0,image0.getIconWidth(),image0.getIconHeight());
        jp0.add(background_lable);

        //设置jp1

        title_jlable.setBounds(0,0,400,90);
        title_jlable.setFont(f0);
        title_jlable.setForeground(Color.white);



        jp1.setLayout(null);
        jp1.setBackground(Color.black);
        jp1.setBounds(0,0,1500,image0.getIconHeight());
        jp1.setOpaque(false);
        jp1.setBackground(null);
        jp1.add(title_jlable);


        //设置jp2
        jb0 = new JButton("登录");
        jb1 = new JButton("退出");
        jb2 = new JButton("制作人员");
        jb3 = new JButton("单机游戏");

        jb0.setBounds(0,175,200,75);
        jb0.setForeground(Color.black);
//        jb0.setContentAreaFilled(false);
        jb1.setBounds(0,475,200,75);
        jb1.setForeground(Color.red);
//        jb1.setContentAreaFilled(false);
        jb2.setBounds(0,330,200,75);
        jb2.setForeground(Color.black);
//        jb2.setContentAreaFilled(false);
        jb0.setFont(f1);
        jb1.setFont(f1);
        jb2.setFont(f1);
        jb3.setForeground(Color.black);
        jb3.setBounds(0,175,200,75);
//        jb3.setContentAreaFilled(false);
        jb3.setFont(f1);
        jb4 = new JButton("签到");
        jb4.setFont(Gui1.f1);
//        jb4.setContentAreaFilled(false);
        jb4.setBounds(1000,100,200,75);
        jb4.setForeground(Color.black);
        jp2.setLayout(null);
        jp2.setBackground(Color.darkGray);
        jp2.setBounds(0,0,1500,image0.getIconHeight());
//        jp2.add(jb0);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.setOpaque(false);
        jp2.setBackground(null);

//        设置actionlistener
        jb0.addActionListener(e -> {
            setVisible(false);
            gui2.setVisible(true);
        });
        jb1.addActionListener(e -> {
            user.updateUser();
            exit();
        });
        jb3.addActionListener(e -> {
            setVisible(false);
            gui3.setVisible(true);
        });
        jb4.addActionListener(e ->{
            checkIn.setUser(user);
            checkIn.check(user,checkIn.contineousDays(user));
            update();
        });

        //将jpanel 放到 JLayeredpane
        jl.add(jp0,JLayeredPane.DEFAULT_LAYER);
        jl.add(jp1,JLayeredPane.MODAL_LAYER);
        jl.add(jp2,JLayeredPane.MODAL_LAYER);

        //设置窗体
        this.setTitle("getrichsimulator");
        this.setLayeredPane(jl);
        this.setBounds(650,300,image0.getIconWidth(),image0.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(image1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
        this.setResizable(false);
    }

    public void exit(){
        System.exit(0);
    }

    public void setGui2 (Gui2 gui2){
        this.gui2 = gui2;
    }

    public void setGui3(Gui3 gui3){
        this.gui3 = gui3;
    }

    public void setUser(User user){this.user = user;}

    public void update (){
        JLabel name = new JLabel("Name:");
        JLabel totalAssets = new JLabel("TotalAssets:");
        JLabel contineousDays = new JLabel("ContineousDays:");
        JLabel odds = new JLabel("Odds:");
        JLabel chance = new JLabel("Chance:");
        JLabel Name = new JLabel(user.getName());
        JLabel TotalAssets = new JLabel(user.getTotalAssets()+"");
        JLabel ContineousDays = new JLabel(user.getCountineousDays()+"");
        JLabel Odds = new JLabel(user.getOdds()+"");
        JLabel Chance = new JLabel(user.getChance()+"");
        name.setFont(f0);
        name.setForeground(Color.black);
        name.setBounds(890,500,100,50);
        totalAssets.setFont(f0);
        totalAssets.setForeground(Color.black);
        totalAssets.setBounds(840,570,200,50);
        contineousDays.setFont(f0);
        contineousDays.setForeground(Color.black);
        contineousDays.setBounds(820,630,250,50);
        odds.setFont(f0);
        odds.setForeground(Color.black);
        odds.setBounds(890,690,100,50);
        chance.setBounds(875,750,150,50);
        chance.setForeground(Color.black);
        chance.setFont(f0);
        Name.setFont(f0);
        Name.setForeground(Color.black);
        Name.setBounds(1040,500,200,50);
        TotalAssets.setForeground(Color.black);
        TotalAssets.setFont(f0);
        TotalAssets.setBounds(1040,570,200,50);
        Chance.setBounds(1040,750,100,50);
        Chance.setFont(f0);
        Chance.setForeground(Color.black);
        Odds.setFont(f0);
        Odds.setForeground(Color.black);
        Odds.setBounds(1040,690,100,51);
        ContineousDays.setBounds(1040,630,100,50);
        ContineousDays.setForeground(Color.black);
        ContineousDays.setFont(f0);

        if (jp1.getComponents().length!=0){
            jp1.removeAll();
        }
        jp1.add(name);
        jp1.add(totalAssets);
        jp1.add(contineousDays);
        jp1.add(chance);
        jp1.add(odds);
        jp1.add(Name);
        jp1.add(TotalAssets);
        jp1.add(Chance);
        jp1.add(ContineousDays);
        jp1.add(Odds);
        jp1.add(title_jlable);
        jp1.repaint();
    }

//    public static void main (String[] args){
//        Gui1 gui1 = new Gui1();
//        gui1.setVisible(true);
//    }
}
