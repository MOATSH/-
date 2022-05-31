package algorithm;
public class PlayerLottery extends Lottery{
    public PlayerLottery(int quantityFromSystem){
        super();
        setLottery(quantityFromSystem);
    }

    @Override
    public void setLottery() {

    }

    /**
     * 将一系列玩家所选数字填入实例的Vector中
     * 在父类中叫做lotteryVector
     * @param quantityNeeded
     */
    public void setLottery(int i){
        this.quantity = i;
    }

    public void set(String s){
        for (int j = 0;j<quantity;j++){
            if (s.charAt(j)=='0'){
                lotteryVector.add(0);
            }
            if (s.charAt(j)=='1'){
                lotteryVector.add(1);
            }
            if (s.charAt(j)=='2'){
                lotteryVector.add(2);
            }
            if (s.charAt(j)=='3'){
                lotteryVector.add(3);
            }
            if (s.charAt(j)=='4'){
                lotteryVector.add(4);
            }
            if (s.charAt(j)=='5'){
                lotteryVector.add(5);
            }
            if (s.charAt(j)=='6'){
                lotteryVector.add(6);
            }
            if (s.charAt(j)=='7'){
                lotteryVector.add(7);
            }
            if (s.charAt(j)=='8'){
                lotteryVector.add(8);
            }
            if (s.charAt(j)=='9'){
                lotteryVector.add(9);
            }
        }
    }

}
