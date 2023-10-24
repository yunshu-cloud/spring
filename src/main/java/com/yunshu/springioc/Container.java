package com.yunshu.springioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// 容器类，负责管理对象，在类加载时，读取配置文件并创建对象
public class Container {
    static Map<String,Object> map = new HashMap<>();

     static {
         // 读取配置文件
         InputStream is = Container.class.getClassLoader().getResourceAsStream("bean.properties");
         Properties properties = new Properties();
         try {
             properties.load(is);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

         // 遍历配置文件中的所有对象
         Enumeration<Object> keys = properties.keys();

         while(keys.hasMoreElements()){
             String key = keys.nextElement().toString();

         }


     }
}
