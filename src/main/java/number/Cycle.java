package number;

/**
 * Created by 高伟冬 on 2017/4/16.
 * gao
 * 14:41
 * 星期日
 */
public class Cycle {
    public static void main(String[] args) {
        int a = 100;
        while (a == 60) {
            System.out.println("OK1");
            a--;
        }
        int b = 100;
        do {
            System.out.println("OK2");
            b--;
        } while (b == 60);
    }
}
