package com.luban.lubancommandback.utils;

/**
 * @ClassName ImageUtil
 * @Author yuanlei
 * @Date 2018/10/22 10:58
 * @Version 1.0
 **/

import java.io.*;

/**
 * 封装读取图片的流
 */
public class ImageUtil {

    //读取图片的输入流
    public static FileInputStream readImage(String path) throws IOException{
        return new FileInputStream(new File(path));
    }

    //读取图片输出流
    public static void readBin2Image(InputStream in,String targetPath){
        File file = new File(targetPath);
        String path = targetPath.substring(0, targetPath.lastIndexOf("/"));

        if(!file.exists()){
            new File(path).mkdir();
        }
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = in.read(buf))!=-1){
                fos.write(buf,0,len);
            }
            fos.flush();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != fos){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
