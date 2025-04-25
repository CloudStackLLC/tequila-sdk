package net.tequilapowered.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * CheckLicense 用于检查许可证功能的注解
 * 如果该注解被应用于类，则其只会在有此功能的情况下加载
 * 如果该注解被应用于方法，则在调用时会检查是否有此功能
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CheckLicense {
    /**
     * 功能名称，默认值为 "application"
     *
     * @return 功能名称
     */
    String value() default "application";

    /**
     * 是否在没有此功能时抛出异常。如果不为 true，则仍然会调用该方法，但是该方法的行为将无法预测
     *
     * @return 是否抛出异常
     */
    boolean throwException() default true;
}
