package com.houji.test.log4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {
    private static Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int age=1;
            int  r;
            int  i17i;
            String hi;
            
            
            
            //哈哈哈哈哈哈哈哈
            logger.debug("输出i:{},age:{}", i,age);
        }


    }
}
