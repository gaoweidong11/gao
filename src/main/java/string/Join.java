package string;

/**
 * Created by 高伟冬 on 2017/4/16.
 * gao
 * 20:05
 * 星期日
 */
public class Join {
    public static void main(String[] args) {
        String s1 = new String("hello");   //声明String s1 对象
        String s2 = new String("word");    //声明String s2 对象
        String s= s1 + " " +s2;                   //将对想 s1和s2连接赋值给 s
        System.out.println(s);//输出s
    }
}
