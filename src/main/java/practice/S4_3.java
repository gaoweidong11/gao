package practice;

/**
 * Created by 高伟冬 on 2017/4/29.
 * gao
 * 17:23
 * 星期六
 */
public class S4_3 {
    /*
    * 实例化
    * 方法的调用
    * 静态
    * 参数
    *
    * */
    //        double sum = 0, a = 1;
//        int i = 1;
//        while (i <= 20) {
//            sum = sum + a;
//            i = i + 1;
//            a = a * (1.0 / i);
//        }
//        int sum = 1;
//        for(int i = 1;i <= 20;i++)
//            sum += 1 / (i++);
//        System.out.println(sum);
/*    private static float prime(int n) {
        int i, item = 1;
        for (i = 1; i <= n; i++) {
            item *= i;
        }
        return 1.0f / item;
    }

    public static void main(String[] args) throws Exception {
        int i, n = 20;
        float sum = 0;
        for (i = 1; i <= n; i++) {
            sum += prime(i);
        }
        System.out.println(sum);
    }*/
    private long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        long sum = 0;
        S4_3 fac = new S4_3();
        for (int i = 0; i < 5; i++) {
            System.out.print("i的值" + (i + 1) + "\t");
            System.out.print("阶乘："+fac.factorial(+i + 1) + "\t");
            System.out.println();
            sum += fac.factorial(i + 1); // 每次循环要 + 1
        }
        System.out.println();
        System.out.println("阶乘和"+sum);
    }
}
