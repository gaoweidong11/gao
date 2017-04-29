/**
 * Created by 高伟冬 on 2017/4/24.
 * gao
 * 19:51
 * 星期一
 */
public class lianxi {
    public static void main(String[] args) {
        print99();
//        int i= add(1,2,3);
//        System.out.println(i);
    }
    private static void print99() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println(" ");
        }
    }

//    private static int add(int x, int y) {重载
//        return x+y;
//    }
//    private static int add(int x, int y,int z) {
//        return x-y+z;
//    }

}
