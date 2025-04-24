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

    /**
     * 虚拟机，如果你不知道它是什么，请使用 DEFAULT，将会根据保护级别自动选择
     *
     * @return 虚拟机 Virtual machine
     */
    VirtualMachine vm() default VirtualMachine.DEFAULT;

    /**
     * 所有可使用的虚拟机
     */
    enum VirtualMachine {
        DEFAULT,
        TIGER_WHITE,
        TIGER_RED,
        TIGER_BLACK,
        FISH_WHITE,
        FISH_RED,
        FISH_BLACK,
        PUMA_WHITE,
        PUMA_RED,
        PUMA_BLACK,
        SHARK_WHITE,
        SHARK_RED,
        SHARK_BLACK,
        DOLPHIN_WHITE,
        DOLPHIN_RED,
        DOLPHIN_BLACK,
        EAGLE_WHITE,
        EAGLE_RED,
        EAGLE_BLACK,
        LION_WHITE,
        LION_RED,
        LION_BLACK,
        COBRA_WHITE,
        COBRA_RED,
        COBRA_BLACK,
        WOLF_WHITE,
        WOLF_RED,
        WOLF_BLACK,
        MUTATE_ONLY,
        FALCON_TINY
    }
}
