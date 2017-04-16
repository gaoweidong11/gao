package number;

/**
 * Created by 高伟冬 on 2017/4/16.
 * gao
 * 19:57
 * 星期日
 */
public class Repetition {
    public static void main(String[] args) {
        int[] arr={7,10,1};//声明数组
        System.out.println("一维数组中所有的元素是：");
        for (int i : arr) {
            //foreach 语句， int i引用的变量， arr指定要循环遍历的数组，最后将i输出。
            System.out.println(i);
        }
    }
}
