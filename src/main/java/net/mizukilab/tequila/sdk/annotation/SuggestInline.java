package net.mizukilab.tequila.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * SuggestInline 用于建议内联的字段或方法。如果其仅被受保护的方法调用
 * 则在混淆时会被内联，并删除该原始字段、方法
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface SuggestInline {
    /**
     * 强制内联。如果为 true，则在混淆时会强制内联该字段或方法。如果无法内联，
     * 则会抛出异常并终止混淆
     *
     * @return 是否强制内联
     */
    boolean force() default false;
}
