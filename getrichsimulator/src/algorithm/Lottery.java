package algorithm;
import java.util.*;
public abstract class Lottery {
    protected int quantity;//一张彩票应该有的号码数，在子类中获得定义
    protected Vector<Integer> lotteryVector = new Vector();

    public Lottery(){};

    /**
     * setter和getter
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    /**
     * 抽象方法设置彩票
     * 子类 SystemLottery 通过随机数实现
     * 子类 PlayerLottery 由玩家根据系统彩票来选
     */
    public abstract void setLottery();
}
