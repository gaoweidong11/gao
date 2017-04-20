package renji;

/**
 * Created by 高伟冬 on 2017/4/19.
 * gao
 * 9:56
 * 星期三
 */
public class Computer {
    String name;
    int score;

    public int  ShowFist() {
        int num =(int)(Math.random()*3+1);
        switch (num) {
            case 1:
                System.out.println(name+"出拳:剪刀");
                break;
            case 2:
                System.out.println(name+"出拳:石头");
                break;
            case 3:
                System.out.println(name+"出拳:布");
                break;
        }
        return num;
    }
}
