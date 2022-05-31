package algorithm;
import java.util.Iterator;

public class InvestmentGame {
    final double awardPool = 3000;//定义奖池

    public InvestmentGame(){};

    /**
     * 判断是否有机会来玩游戏
     * 条件是chance不为0且总资产大于所要资金
     * @param user
     * @param key
     * @return
     */
    public boolean chanceToPlay(User user,SystemLottery key){
        return user.getChance()>0 && key.getCostDemand()<user.getTotalAssets();
    }

    /**
     * 根据游戏结果进行结算
     * 输入的是用户对象，所选系统彩票，玩家彩票
     * @param user
     * @param sl
     * @param pl
     */
    public void balance(User user,SystemLottery sl,PlayerLottery pl){
        int cr = comparingResult(sl,pl);
        long aog = awardOfGame(cr,sl);
        user.setTotalAssets(user.getTotalAssets()+aog);
        user.setChance(user.getChance()-1);
        user.updateUser();
    }

    /**
     * 传入系统彩票和玩家彩票，输出匹配号码个数
     * @param key
     * @param player
     * @return
     */
    public int comparingResult(Lottery key, Lottery player) {
        int matchingQuantity = 0;
        for(Iterator<Integer> i = key.lotteryVector.iterator();i.hasNext();){
            int keyOne = i.next();
            for(Iterator<Integer> j = player.lotteryVector.iterator();j.hasNext();){
                if(keyOne == j.next())
                    matchingQuantity++;
            }
        }
        return matchingQuantity;
    }

    /**
     * 计算可以获得多少奖金
     * @param comparingResult
     * @param key
     * @return
     */
    public long awardOfGame(int comparingResult,SystemLottery key){
        if(comparingResult>=key.minQuantityForAwards)
        {        MyAlgorithm m = new MyAlgorithm();
        long award = key.getCostDemand()
                + (long)awardPool*m.comb(key.getQuantity(),12)/m.comb(comparingResult,key.getQuantity());
        return award;
        }
        else
            return 0;
    }

}
