package io;

import java.io.File;

/**
 * Created by 高伟冬 on 2017/7/30.
 * gao
 * 15:36
 * 星期日
 */
public class FileTestDemo {
    public static void main(String[] args){
        File file = new File("word.txt");
        if(file.exists()){
            String name = file.getName();
            long length=file.length();
            boolean hidden = file.isHidden();
            System.out.println("文件的名称："+name);
            System.out.println("文件的长度："+length);
            System.out.println("文件是否是隐藏文件:"+hidden);
        }else {
            System.out.println("文件不存在！");
        }
    }
}
