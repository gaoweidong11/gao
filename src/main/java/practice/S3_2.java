package practice;

/**
 * Created by 高伟冬 on 2017/4/29.
 * gao
 * 17:10
 * 星期六
 */
public class S3_2 {
    static int age = 20; // 声明的类变量。

    public static void map() {
        age = 30;
        String name = "lili";
    }

    public static void main(String[] args) { // 主方法
      //System.out.println(name+ "的年龄是："+age); //错误代码局部变量不可用于主方法中
    }
}
