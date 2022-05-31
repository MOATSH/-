package algorithm;
import java.util.*;

public class SystemLottery extends Lottery{
    private double rate;//表示胜率，即每种可获利情况概率的和
    private long costDemand;//需要投入的资金
    final int range = 4;//系统生成球的个数
    final int minQuantity = 3;//系统生成球的最小个数值
    final int minQuantityForAwards = 2;//最低中奖数，应该小于minQuantity

    MyAlgorithm m = new MyAlgorithm();
    /**
     * 该构造器将直接生成一个完整的系统给出彩票
     * 同时应该计算出胜率，匹配一个恰当的需求资金
     *
     */
    public SystemLottery(){
        super();

        int randomQuantity = (int)(Math.random()*range+minQuantity);
        super.setQuantity(randomQuantity);

        setLottery();
        setRate(countRate(randomQuantity));
        setCostDemand(countDemand(randomQuantity));
    }


    /**
     * 以下是赢率和需求资金的getter
     * @return
     */
    public double getRate() {
        return rate;
    }
    public long getCostDemand() {
        return costDemand;
    }

    /**
     * 以下是赢率和需求资金的setter
     * @param rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setCostDemand(long costDemand) {
        this.costDemand = costDemand;
    }

    /**
     * 重写彩票生成，由随机数生成
     */
    @Override
    public void setLottery() {
        int number = 1 ;
        while(super.lotteryVector.size() < super.getQuantity()){
            Random rand = new Random();
            number = rand.nextInt(12) + 1 ;//生成1到12的随机数
            if(super.lotteryVector.contains(number))
                continue;
            else
                super.lotteryVector.add(number);
        }
    }

    /**
     * 由排列组合计算出赢率
     * @return
     */
    public double countRate(int realQuantity){
        long awardComb = 0;
        long allComb = m.comb(realQuantity,12);
        for(int n=minQuantityForAwards;n<=realQuantity;n++){
            awardComb += (m.comb(n,realQuantity)*m.comb(realQuantity-n,12-realQuantity));
        }

        return (double)awardComb/allComb;
    }

    /**
     * 计算所需资金
     * @return
     */
    public long countDemand(int realQuantity){
        return (long)(2000*(1-countRate(realQuantity)));
    }

}
