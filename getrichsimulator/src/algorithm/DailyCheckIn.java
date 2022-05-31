package algorithm;
import javax.swing.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class DailyCheckIn {
    /**
     * 设置awards数组，决定在第几天奖励多少
     */
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    long[] awards  = {1000,2000,3000,4000,5000,6000,7000};

    Properties userInfo = new Properties();//声明一个Properties，下面的方法会用到

    /**
     * 空构造器
     */
    public DailyCheckIn(){}

    /**
     * 获取今天是本年的第几天
     * @return
     */
    public static int today(){
            Date date = new Date();
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            int day = ca.get(Calendar.DAY_OF_YEAR);//一年中的第几天
            return day;
    }

    /**
     * 获得连续签到天数
     * @param user
     * @return
     */
    public int contineousDays(User user){
        try {
            int day = DailyCheckIn.today();
            int timeInterval = day - user.getTheLastCheckedDay();
//            ResourceBundle rb= ResourceBundle.getBundle("user");
//            int timeInterval = day - Integer.parseInt(rb.getString("theLastCheckedDay"));//该值为距上次签到相差几天

            if(timeInterval <= 0)//表示已签到
                return 0;
            if(timeInterval > 1 )//表示断签
                return 1;
            else//返回连续签到天数并加一
                return user.getCountineousDays()+1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 执行签到的操作
     * 设置 总资产totalAssets,上一次签到日期theLastCheckedDay,连续签到天数contineousDays
     * @param user
     * @param continueDays
     */
    public void check(User user,int continueDays){
            int day = DailyCheckIn.today();
        if(continueDays <= 0) {
            JOptionPane.showMessageDialog(null,"您今天已签到","Message",JOptionPane.PLAIN_MESSAGE);
        }//今天签到将不会做任何变化

        if(continueDays == 1 ){
            user.setTheLastCheckedDay(day);
            user.setCountineousDays(1);
            user.setTotalAssets(user.getTotalAssets()+awards[0]);
            user.setChance(5);

            user.updateUser();
            JOptionPane.showMessageDialog(null,"签到成功,您获得了"+awards[0]);
        }//昨天没签到,将连续签到数归1

        else if(continueDays > 1){
            user.setTheLastCheckedDay(day);
            user.setCountineousDays(user.getCountineousDays()+1);
            if(continueDays < 7) {
                user.setTotalAssets(user.getTotalAssets() + awards[continueDays - 1]);
                JOptionPane.showMessageDialog(null, "签到成功,您获得了" + awards[continueDays - 1]);
            }
            else{//超过七天也只能拿到第七天的奖励}
                user.setTotalAssets(user.getTotalAssets() + awards[6]);
                JOptionPane.showMessageDialog(null, "签到成功,您获得了" + awards[6]);
            }
            user.setChance(5);

            user.updateUser();

//            System.out.println("签到成功");
        }//签到成功

        user.updateUser();
    }
}
