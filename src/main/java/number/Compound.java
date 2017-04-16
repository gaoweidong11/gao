package number;


/**
 * Created by 高伟冬 on 2017/4/15.
 * gao
 * 23:47
 * 星期六
 */
public class Compound {
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40 ;
            System.out.println(y);
            int z= 25;
            boolean b;
            {
                b= true;
                System.out.println(b);
            }
        }
        String word = "hello word!";
        System.out.println(word);
    }
}
