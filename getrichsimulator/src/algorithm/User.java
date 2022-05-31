package algorithm;
import javax.swing.*;
import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;


public class User {
    private String id;
    private String name;
    private long totalAssets;//总资产
    private int chance;//每天游玩机会
    private double odds;//类似胜率
    private int countineousDays;//连续签到日期
    private int theLastCheckedDay;//上一次签到日期

    Properties userProperties = new Properties();//userProperties用来处理键值对文件。存储了所有用户信息

    /**
     * 构造器 创建一个用户 单例模式
     */
    private static User singletonInstance;
    private User() {
        id = "2021";
//        name = initName;
        totalAssets = 0;
        chance = 5;
        odds = 0.0;
        theLastCheckedDay = 0;
        countineousDays = 0;

        try {
            this.loadInformation();
        }
        catch (Exception e){
            this.innitial(JOptionPane.showInputDialog("请输入姓名"));
        }
        updateUser();
    }//传入id和名字，其余属性直接定义为为初始值；

    public static User getSingletonInstance() {
        if(singletonInstance == null) {
            singletonInstance = new User();
        }
        return singletonInstance;
    }

    /**
     * 以下是所有用户信息的getter
     */
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getOdds() {
        return odds;
    }
    public long getTotalAssets() {
        return totalAssets;
    }
    public int getChance() {
        return chance;
    }
    public int getCountineousDays(){return countineousDays;}
    public int getTheLastCheckedDay() {
        return theLastCheckedDay;
    }
    /**
     * 以下是所有用户信息的setter
     */
    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }
    public void setChance(int chance) {
        this.chance = chance;
    }
    public void setCountineousDays(int countineousDays) {
        this.countineousDays = countineousDays;
    }
    public void setTheLastCheckedDay(int theLastCheckedDay) {
        this.theLastCheckedDay = theLastCheckedDay;
    }
    public void setOdds(double odds) {
        this.odds = odds;
    }
    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}

    /**
     * 该方法用于更新用户信息，在其它类使用时，其原理是在其它类（若要读原始信息，应在setter之前）首先用setter设置好信息，再存储到文件中。
     */
    public void updateUser(){
       try{
           userProperties.setProperty("id", getId());
           userProperties.setProperty("name",getName());
           userProperties.setProperty("totalAssets",getTotalAssets()+"");
           userProperties.setProperty("chance",getChance()+"");
           userProperties.setProperty("odds",getOdds()+"");
           userProperties.setProperty("theLastCheckedDay",getTheLastCheckedDay()+"");
           userProperties.setProperty("contineousDays",getCountineousDays()+"");

           userProperties.store(new FileOutputStream("src/user.properties"),"这是用户的信息");
    }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void loadInformation (){
        ResourceBundle rb= ResourceBundle.getBundle("user");

        this.setTotalAssets(Long.parseLong(rb.getString("totalAssets")));
        this.setChance(Integer.parseInt(rb.getString("chance")));
        this.setCountineousDays(Integer.parseInt(rb.getString("contineousDays")));
        this.setOdds(Double.parseDouble(rb.getString("odds")));
        this.setTheLastCheckedDay(Integer.parseInt(rb.getString("theLastCheckedDay")));
        this.setId(rb.getString("id"));
        this.setName(rb.getString("name"));
    }

    public void innitial (String s){
        this.setName(s);
    }
}
