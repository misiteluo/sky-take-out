package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ，自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)//表明这个注解只能作用于方法之上
@Retention(RetentionPolicy.RUNTIME)//表示可以被保留到java三个阶段中的运行阶段
public @interface AutoFill {

    //指定数据库操作类型: update delete
    OperationType value();

}
