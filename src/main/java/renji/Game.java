package renji;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/4/19.
 * gao
 * 9:57
 * 星期三
 */
class Game {
    private Person per=new Person();
    private Computer com=new Computer();
    private int count=0;

    void GameFist() {
        Scanner input=new Scanner(System.in);
        System.out.println("------------欢迎进入游戏世界-------------\n");
        System.out.println("\t****************************");
        System.out.println("\t**   猜拳,  开始    **    ");
        System.out.println("\t****************************");
        System.out.println("出拳规则:1.剪刀2.石头3.布");
        System.out.println("请选择对方角色:(1.刘备  2.孙权  3.曹操):");
        int num = input.nextInt();
        switch (num) {
            case 1:
                com.name="刘备";
                break;
            case 2:
                com.name="孙权";
                break;
            case 3:
                com.name="曹操";
                break;
        }
        System.out.print("请输入你的名字:");
        per.name=input.next();
        System.out.println(per.name+"\tVS\t"+com.name);
        System.out.println();
        System.out.print("要开始了吗？(Y/n)");
        String result=input.next();
        while (result.equals("y")) {
            int perFist=per.ShowFist();
            int comFist=com.ShowFist();
            if (perFist==comFist) {
                System.out.println("和局，真衰，嘿嘿,等着瞧吧！");
            }else if ((perFist==1&&comFist==2)||(perFist==2&&comFist==3)||(perFist==3&&comFist==1)) {
                System.out.println("你输了  笨蛋！！");
                com.score++;
            }else {
                System.out.println("你赢了！恭喜！");
                per.score++;
            }
            count++;
            System.out.println();
            System.out.print("是否继续？（y/n）");
            result=input.next();
        }
        System.out.println("----------------------------------------");
        System.out.println(com.name+"\tVS\t"+per.name);
        System.out.println("对战次数"+count);
        if (per.score==com.score) {
            System.out.println("平局");
        }else if (per.score>com.score) {
            System.out.println("你赢啦");
        }else {
            System.out.println("你输啦！");
        }

    }
}
