package practice;

/**
 * Created by 高伟冬 on 2017/4/29.
 * gao
 * 17:16
 * 星期六
 */
public class S3_3 {
    public static void main(String[] args) {//类型转换
        long mylong = 45789;
        byte mybyte = 123;
        short myshort = 32564;
        int myint1 = (int) mylong;
        int myint2 = (int) myshort;
        int myint3 = (int) mybyte;
        System.out.println(myint1);
        System.out.println(myint2);
        System.out.println(myint3);
    }
}
