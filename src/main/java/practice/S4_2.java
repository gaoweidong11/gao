package practice;

/**
 * Created by 高伟冬 on 2017/4/29.
 * gao
 * 17:20
 * 星期六
 */
public class S4_2 {
    public static void main(String args[]){//用for循环 打印菱形
        for(int i=1;i<=7;i+=2){
            for(int kong=7;kong>i-1;kong--){
                System.out.print(" ");
            }
            for(int xing=1;xing<=i;xing++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=1;j<=5;j+=2){
            for(int kong1=1;kong1<j+3;kong1++){
                System.out.print(" ");
            }
            for(int xing1=5;xing1>=j;xing1--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
