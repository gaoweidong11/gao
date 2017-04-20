package string;

/**
 * Created by 高伟冬 on 2017/4/20.
 * gao
 * 19:46
 * 星期四
 */
public class NewStr {
    public static void main(String[] args) {
        String str = "abbress";
        //将字符串str中的“a”改变成“A”，返回新的字符串
        String newstr = str.replace("a","A");
        System.out.println(newstr);//输出改变后的字符串
    }
}
