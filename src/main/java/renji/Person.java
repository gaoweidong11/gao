package renji;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/4/19.
 * gao
 * 9:58
 * 星期三
 */
public class Person {
    String name;
    int score;

    public int  ShowFist() {
        Scanner input=new Scanner(System.in);
        System.out.println("请选择出拳1.剪刀   2.石头   3.布（输入相对应的数字）:");
        int num =input.nextInt();
        switch (num) {
            case 1:
                System.out.println("你出拳:剪刀");
                break;
            case 2:
                System.out.println("你出拳:石头");
                break;
            case 3:
                System.out.println("你出拳:布");
                break;
        }
        return num;
    }
}
