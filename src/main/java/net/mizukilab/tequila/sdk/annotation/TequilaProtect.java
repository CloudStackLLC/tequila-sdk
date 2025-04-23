package net.mizukilab.tequila.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标记需要保护的方法或类（静态初始化块）。
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface TequilaProtect {
    /**
     * 保护级别：
     * 0 - 不保护（No protection）
     * 1 - 仅保护，不使用更高级的保护（Only protection）
     * 2 - 轻量级保护（Lightweight protection），默认
     * 3 - 高强度保护（Strong protection）
     * 4 - 混合保护（Hybrid protection），其性能开销极大且不稳定，请仅在授权验证等重要场景使用
     *
     * @return 保护级别 Protection level
     */
    int level() default 2;
}
