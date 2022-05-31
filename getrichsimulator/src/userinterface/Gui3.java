package userinterface;

import algorithm.*;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Gui3 extends JFrame{
    public static ImageIcon image0 = new ImageIcon("背景2.jpg");
    private Gui4 gui4;
    private Gui5 gui5;

    public void setGui5(Gui5 gui5) {
        this.gui5 = gui5;
    }

    public void setGui4(Gui4 gui4) {
        this.gui4 = gui4;
    }

    int i = 0;
    Font f1 = new Font("楷体",Font.BOLD,18);
    private User user;
    public FileOutputStream fout;
    private InvestmentGame game = new InvestmentGame();
//    private InvestmentGame game1 = new InvestmentGame();
//    private InvestmentGame game2 = new InvestmentGame();
    private SystemLottery sl0 = new SystemLottery();
    private SystemLottery sl1 = new SystemLottery();
    private SystemLottery sl2 = new SystemLottery();
    private SystemLottery chosesl;
    private JPanel jp9 = new JPanel();

    public void setUser(User user) {
        this.user = user;
    }

    {
        try {
            fout = new FileOutputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private OutputStreamWriter writer;
    {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(fout, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private Gui1 gui1;

    private JLayeredPane jl = new JLayeredPane();

    private JPanel jp0 = new JPanel();
    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();

    private JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;

    private JTextArea jt0 = new JTextArea(1,20);

    public Gui3(){

        JLabel backgroung_label = new JLabel(image0);
        jp0.setBounds(0,0, Gui1.image0.getIconWidth(),Gui1.image0.getIconHeight());
        jp0.add(backgroung_label);

        bt13 = new JButton();
        bt14 = new JButton();

//        JLabel jLabel = new JLabel(Gui1.image0);
//        jp9.setBounds(0,0,472,300);
//        jp9.add(jLabel);
//        JButton Jbu = new JButton("Ok");
//        Jbu.setContentAreaFilled(false);
//        Jbu.setForeground(Color.black);
//        Jbu.setFont(Gui1.f0);
//        Jbu.setBounds(200,140,100,50);
//        jp9.add(Jbu);

        bt0 = new JButton();
        bt0.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("0 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt0.setIcon(new ImageIcon("Button0.png"));
        bt13.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("10 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt14.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("11 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt15 = new JButton();
        bt15.addActionListener(e -> {
            if (i<chosesl.getQuantity()){
                jt0.append("12 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt13.setIcon(new ImageIcon("Button10.png"));
        bt14.setIcon(new ImageIcon("Button11.png"));
        bt15.setIcon(new ImageIcon("Button12.png"));
        bt1 = new JButton();
        bt1.addActionListener(e ->{
            if (i<chosesl.getQuantity()){
                jt0.append("1 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt1.setIcon(new ImageIcon("Button1.png"));
        bt2 = new JButton();
        bt2.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("2 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt2.setIcon(new ImageIcon("Button2.png"));
        bt3 = new JButton();
        bt3.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("3 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt3.setIcon(new ImageIcon("Button3.png"));
        bt4 = new JButton();
        bt4.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("4 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt4.setIcon(new ImageIcon("Button4.png"));
        bt5 = new JButton();
        bt5.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("5 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt5.setIcon(new ImageIcon("Button5.png"));
        bt6 = new JButton();
        bt6.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("6 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt6.setIcon(new ImageIcon("Button6.png"));
        bt7 = new JButton();
        bt7.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("7 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt7.setIcon(new ImageIcon("Button7.png"));
        bt8 = new JButton();
        bt8.addActionListener(e->{
            if (i<chosesl.getQuantity()){
                jt0.append("8 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }

            }
        });
        bt8.setIcon(new ImageIcon("Button8.png"));
        bt9 = new JButton();
        bt9.addActionListener(e -> {
            if (i<chosesl.getQuantity()){
                jt0.append("9 ");
                i++;
                if (i == chosesl.getQuantity()){
                    bt10.setVisible(true);
                }
            }
        });
        bt9.setIcon(new ImageIcon("Button9.png"));

        bt10 = new JButton("确认");
        bt10.setVisible(false);
        bt10.addActionListener(e->{
            PlayerLottery pl = new PlayerLottery(chosesl.getQuantity());
            pl.set(jt0.getText());
            long x = user.getTotalAssets();
            game.balance(user,chosesl,pl);
            sl2 = new SystemLottery();
            sl0 = new SystemLottery();
            sl1 = new SystemLottery();
            i = 0;
            bt10.setVisible(false);
            jp1.setVisible(false);
            long y = user.getTotalAssets();
            if (x>y) {
                gui4.setVisible(true);
            }
            else {
                gui5.setVisible (true);
            }
//            jp9.setVisible(true);
            update();
//            JOptionPane.showMessageDialog(this,"你现在有"+user.getTotalAssets()+"钱了！","Message",JOptionPane.PLAIN_MESSAGE);

        });
        bt11 = new JButton("后退");
        bt11.addActionListener(e -> {
            String s = "";
            for (int i=0; i<jt0.getText().length()-1; i++){
                s += jt0.getText().charAt(i);
            }

            jt0.setText("");
            jt0.append(s);
        });
        bt12 = new JButton("返回");
        bt12.setFont(Gui1.f1);
        bt12.setForeground(Color.black);
        bt12.setContentAreaFilled(false);
        bt12.setBounds(0,0,150,50);
        bt0.setForeground(Color.blue);
        bt0.setContentAreaFilled(false);
        bt0.setBounds(0,10,70,50);
        bt0.setFont(Gui1.f1);
        bt1.setForeground(Color.blue);
        bt1.setContentAreaFilled(false);
        bt1.setBounds(80,10,70,50);
        bt1.setFont(Gui1.f1);
        bt2.setForeground(Color.blue);
        bt2.setContentAreaFilled(false);
        bt2.setBounds(160,10,70,50);
        bt2.setFont(Gui1.f1);
        bt3.setForeground(Color.blue);
        bt3.setContentAreaFilled(false);
        bt3.setBounds(240,10,70,50);
        bt3.setFont(Gui1.f1);
        bt4.setForeground(Color.blue);
        bt4.setContentAreaFilled(false);
        bt4.setBounds(320,10,70,50);
        bt4.setFont(Gui1.f1);
        bt5.setForeground(Color.blue);
        bt5.setContentAreaFilled(false);
        bt5.setBounds(80,70,70,50);
        bt5.setFont(Gui1.f1);
        bt6.setForeground(Color.blue);
        bt6.setContentAreaFilled(false);
        bt6.setBounds(160,70,70,50);
        bt6.setFont(Gui1.f1);
        bt7.setForeground(Color.blue);
        bt7.setContentAreaFilled(false);
        bt7.setBounds(240,70,70,50);
        bt7.setFont(Gui1.f1);
        bt13.setForeground(Color.black);
        bt13.setContentAreaFilled(false);
        bt13.setBounds(160,130,70,50);
        bt14.setForeground(Color.black);
        bt14.setContentAreaFilled(false);
        bt14.setBounds(240,130,70,50);
        bt15.setForeground(Color.black);
        bt15.setContentAreaFilled(false);
        bt15.setBounds(320,130,70,50);
        bt8.setForeground(Color.blue);
        bt8.setContentAreaFilled(false);
        bt8.setBounds(320,70,70,50);
        bt8.setFont(Gui1.f1);
        bt9.setForeground(Color.blue);
        bt9.setContentAreaFilled(false);
        bt9.setBounds(80,130,70,50);
        bt9.setFont(Gui1.f1);
        bt10.setForeground(Color.blue);
        bt10.setContentAreaFilled(false);
        bt10.setBounds(180,250,80,50);
        bt10.setFont(Gui1.f1);
        bt11.setForeground(Color.blue);
        bt11.setContentAreaFilled(false);
        bt11.setBounds(300,250,80,50);
        bt11.setFont(Gui1.f1);
        jt0.setBounds(86,200,300,50);
        jt0.setFont(Gui1.f0);
        jt0.setForeground(Color.white);
        jt0.setBackground(Color.black);
//        bt13 = new JButton("签到");
//        bt13.setBounds(700,200,100,100);
//        bt13.setContentAreaFilled(false);
//        bt13.setFont(Gui1.f0);
//        bt13.setForeground(Color.cyan);
//        jt0.setEditable(false);

        jp1.setLayout(null);
        jp1.setBounds(350,200,472,300);
        jp1.setBackground(Color.white);
//        jp1.add(bt0);
        jp1.add(bt1);
        jp1.add(bt2);
        jp1.add(bt3);
        jp1.add(bt4);
        jp1.add(bt5);
        jp1.add(bt6);
        jp1.add(bt7);
        jp1.add(bt8);
        jp1.add(bt9);
        jp1.add(bt10);
//        jp1.add(bt11);
        jp1.add(jt0);
        jp1.add(bt13);
        jp1.add(bt14);
        jp1.add(bt15);
//        jp1.add(jp9);
//        jp9.setVisible(false);
//        jp1.setBackground(null);
//        jp1.setOpaque(false);
//        jp1.add(bt13);

        jp2.setLayout(null);
        jp2.setBackground(null);
        jp2.setOpaque(false);
        jp2.setBounds(0,20,400,Gui1.image0.getIconHeight());
        jp2.add(bt12);

        bt12.addActionListener(e ->{
            this.setVisible(false);
            gui1.update();
            gui1.setVisible(true);
        });

        jl.add(jp0,JLayeredPane.DEFAULT_LAYER);
        jl.add(jp1,JLayeredPane.MODAL_LAYER);
        jl.add(jp2,JLayeredPane.MODAL_LAYER);

        jp1.setVisible(false);
        this.setTitle("getrichsimultor");
        this.setLayeredPane(jl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(650,300,Gui1.image0.getIconWidth(),Gui1.image0.getIconHeight());
        this.setIconImage(Gui1.image1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT));
        this.setResizable(false);
    }

    public void setGui1(Gui1 gui1){this.gui1 = gui1;}

    public int update(){
        JRadioButton game0 = new JRadioButton("Game0");
        JRadioButton game1 = new JRadioButton("Game1");
        JRadioButton game2 = new JRadioButton("Game2");

        JLabel rate0 = new JLabel("获奖概率："+sl0.getRate()+"");
        JLabel rate1 = new JLabel("获奖概率："+sl1.getRate()+"");
        JLabel rate2 = new JLabel("获奖概率："+sl2.getRate()+"");
        JLabel cost0 = new JLabel("投入资金："+sl0.getCostDemand()+"");
        JLabel cost1 = new JLabel("投入资金："+sl1.getCostDemand()+"");
        JLabel cost2 = new JLabel("投入资金："+sl2.getCostDemand()+"");
        JLabel quty0 = new JLabel("数量："+sl0.getQuantity()+"");
        JLabel quty1 = new JLabel("数量："+sl1.getQuantity()+"");
        JLabel quty2 = new JLabel("数量："+sl2.getQuantity()+"");

        rate0.setFont(f1);
        rate1.setFont(f1);
        rate2.setFont(f1);
        cost0.setFont(f1);
        cost1.setFont(f1);
        cost2.setFont(f1);
        quty0.setFont(f1);
        quty1.setFont(f1);
        quty2.setFont(f1);
        rate0.setForeground(Color.black);
        cost0.setForeground(Color.black);
        quty0.setForeground(Color.black);
        rate1.setForeground(Color.black);
        cost1.setForeground(Color.black);
        quty1.setForeground(Color.black);
        rate2.setForeground(Color.black);
        cost2.setForeground(Color.black);
        quty2.setForeground(Color.black);
        rate0.setBounds(0,100,160,50);
        rate1.setBounds(0,310,160,50);
        rate2.setBounds(0,500,160,50);
        cost0.setBounds(0,200,300,50);
        cost1.setBounds(0,410,300,50);
        cost2.setBounds(0,600,300,50);
        quty0.setBounds(140,150,300,50);
        quty1.setBounds(140,360,300,50);
        quty2.setBounds(140,550,300,50);

        game1.setFont(Gui1.f0);
        game2.setFont(Gui1.f0);
        game0.setFont(Gui1.f0);
        game0.setForeground(Color.black);
        game1.setForeground(Color.black);
        game2.setForeground(Color.black);
//        game0.setContentAreaFilled(false);
//        game1.setContentAreaFilled(false);
//        game2.setContentAreaFilled(false);

        game0.setBounds(0,150,130,50);
        game1.setBounds(0,360,130,50);
        game2.setBounds(0,550,130,50);

        game0.addActionListener(e->{
            if (user.getChance()>0) {
                if (game0.isSelected()) {
                    jt0.setText("");
                    jp1.setVisible(true);
                    game1.setSelected(false);
                    game2.setSelected(false);
                    chosesl = sl0;
                } else {
                    jp1.setVisible(false);
                    jt0.setText("");
                }
            }
            else {
                JOptionPane.showMessageDialog(this,"明天再来玩吧~","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });
        game1.addActionListener(e->{
            if (user.getChance()>0) {
                if (game1.isSelected()) {
                    jt0.setText("");
                    jp1.setVisible(true);
                    game0.setSelected(false);
                    game2.setSelected(false);
                    chosesl = sl1;
                } else {
                    jp1.setVisible(false);
                    jt0.setText("");
                }
            }
            else {
                JOptionPane.showMessageDialog(this,"明天再来玩吧~","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });
        game2.addActionListener(e->{
            if (user.getChance()>0) {
                if (game2.isSelected()) {
                    jt0.setText("");
                    jp1.setVisible(true);
                    game0.setSelected(false);
                    game1.setSelected(false);
                    chosesl = sl2;
                } else {
                    jp1.setVisible(false);
                    jt0.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"明天再来玩吧~","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });

        if (jp2.getComponents().length!=0){
            jp2.removeAll();
        }

        jp2.add(game0);
        jp2.add(game1);
        jp2.add(game2);
        jp2.add(cost0);
        jp2.add(cost1);
        jp2.add(cost2);
        jp2.add(rate0);
        jp2.add(rate1);
        jp2.add(rate2);
        jp2.add(quty0);
        jp2.add(quty1);
        jp2.add(quty2);
        jp2.add(bt12);
        jp2.repaint();



        if (game0.isSelected()){
            return 0;
        }
        else if (game1.isSelected()){
            return 1;
        }
        else {
            return 2;
        }

    }

    public static void main (String[] args){
        Gui3 gui3 = new Gui3();
        gui3.setVisible(true);
    }
}
