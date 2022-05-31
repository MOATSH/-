package algorithm;
/**
 * 该类存放算法
 */

public class MyAlgorithm {
    public MyAlgorithm(){};

    /**
     * 计算阶乘
     * @param num
     * @return
     */
    public int factorial(int num) {
        int sum=1;
        if(num<0) {
            throw new IllegalArgumentException("需要计算的参数必须为正数！");//抛出不合理参数异常
        }
        if(num==1) {
            return 1;//跳出循环
        }else {
            sum=num*factorial(num-1);//递归
            return sum;
        }
    }

    /**
     * 计算组合数 从m中选n个
     * @param n
     * @param m
     * @return
     */
    public long comb(int n,int m) {
        if(n==0)
            return 1;
        if(n==1)
            return m;
        if(n>m/2)
            return comb(m-n,m);
        if(n>1)
            return comb(n-1,m-1)+comb(n,m-1);
        return -1;
    }

}
