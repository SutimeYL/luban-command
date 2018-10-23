package com.luban.lubancommandback.utils;//package com.luban.command.utils;
//
///**
// * @ClassName ImageDemo
// * @Author yuanlei
// * @Date 2018/10/22 11:11
// * @Version 1.0
// **/
//
//
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// * 测试将图片写入数据库
// */
//public class ImageDemo {
//
//    public static void readImage2DB(){
//        String path = "D:/1.png";
//                 Connection conn = null;
//              PreparedStatement ps = null;
//               FileInputStream in = null;
//              try {
//                       in = ImageUtil.readImage(path);
//                       conn = DBUtil.getConn();
//                       String sql = "insert into photo (id,name,photo)values(?,?,?)";
//                       ps = conn.prepareStatement(sql);
//                       ps.setInt(1, 1);
//                      ps.setString(2, "Tom");
//                       ps.setBinaryStream(3, in, in.available());
//                       int count = ps.executeUpdate();
//                       if (count > 0) {
//                               System.out.println("插入成功！");
//                            } else {
//                                System.out.println("插入失败！");
//                             }
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                   } finally {
//                         DBUtil.closeConn(conn);
//                         if (null != ps) {
//                                try {
//                                        ps.close();
//                                     } catch (SQLException e) {
//                                         e.printStackTrace();
//                                     }
//                            }
//                    }
//    }
//
//}
