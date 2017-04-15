package number;

/**
 * Created by 高伟冬 on 2017/4/15.
 * gao
 * 22:14
 * 星期六
 */
public class Part {                    //新建Part类
    static final double PI=3.14;        //声明常量PI  如果不赋值  会报错误提示
    static int age=23;            //声明int类型 age 并赋值

    public static void main(String[] args) {//主方法
        final int number;//声明int 常量
        number=23456;//对常量赋值
        age=22;//对变量 再次赋值
//        number=1234;      错误的代码  因为 number 是常量 只能进行一次赋值
        System.out.println("常量PI的值："+PI); //输出PI
        System.out.println("赋值后的number的值："+number);//输出number
        System.out.println("int型变量age的值："+age);//输出age
    }
}
