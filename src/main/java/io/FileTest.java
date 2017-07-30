package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by 高伟冬 on 2017/7/30.
 * gao
 * 15:28
 * 星期日
 */
public class FileTest {
    public static void main(String[] args){
        File file = new File("word.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除！");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件已创建！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
