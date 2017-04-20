package string;

/**
 * Created by 高伟冬 on 2017/4/20.
 * gao
 * 18:58
 * 星期四
 */
public class Text {
    public static void main(String[] args) {
        String str ="We are students";
        //将空字符串在str中的索引赋值给变量size
        int size = str.lastIndexOf("");
        //输出变量size
        System.out.println("空字符在str中的索引是："+ size);
        //输出str字符串的长度
        System.out.println("字符串的长度是："+str.length());
    }
}
