package number;

/**
 * Created by 高伟冬 on 2017/4/16.
 * gao
 * 19:51
 * 星期日
 */
public class Cirulate {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i+=2) {
            sum = sum +i;

        }
        System.out.println("2到100 之间所有偶数之和："+sum);
    }
}
