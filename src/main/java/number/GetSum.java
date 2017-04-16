package number;

/**
 * Created by 高伟冬 on 2017/4/16.
 * gao
 * 14:37
 * 星期日
 */
public class GetSum {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("sum的值："+sum);
    }
}
