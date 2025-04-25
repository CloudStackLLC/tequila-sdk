package net.tequilapowered.sdk;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Tequila 用于 Tequila SDK 的内联特性
 * 该类仅作为混淆器标识，混淆后不会保留，方法实现仅用于测试
 */
public final class Tequila {
    private Tequila() {
        throw new UnsupportedOperationException();
    }

    /**
     * 增强应用安全性的工具类
     * 目前仅支持 Windows 平台，其他平台固定返回指定数值
     */
    public static final class enhance {
        private enhance() {
            throw new UnsupportedOperationException();
        }

        /**
         * 检查应用是否运行在虚拟环境中
         * 检测到虚拟环境时返回随机数，否则返回 value
         * 若 value 为 1，检测到虚拟环境时返回 0
         *
         * @param value 检测到虚拟环境时的返回值
         * @return 检测到虚拟环境返回随机数，否则返回 value
         */
        public static int checkVirtualEnvironment(int value) {
            return value;
        }

        /**
         * 检查应用是否被调试
         * 检测到调试器时返回随机数，否则返回 value
         * 若 value 为 1，检测到调试器时返回 0
         *
         * @param value 检测到调试器时的返回值
         * @return 检测到调试器返回随机数，否则返回 value
         */
        public static int checkDebugAttached(int value) {
            return value;
        }

        /**
         * 检查应用是否被篡改（如脱壳）
         * 检测到被修改时返回随机数，否则返回 value
         * 若 value 为 1，检测到被修改时返回 0
         *
         * @param value 检测到被修改时的返回值
         * @return 检测到被修改返回随机数，否则返回 value
         */
        public static int checkCyclicRedundancyCheck(int value) {
            return value;
        }
    }

    /**
     * 应用许可证管理工具类
     * 仅应在受保护方法中调用，以降低被恶意利用的风险
     */
    public static final class license {
        private license() {
            throw new UnsupportedOperationException();
        }

        private static final Set<String> availableFeatures = new HashSet<>();

        /**
         * 启用指定功能
         *
         * @param feature 功能名称
         */
        public static void enableFeature(String feature) {
            availableFeatures.add(feature);
        }

        /**
         * 判断指定功能是否可用
         * 可用时返回 value，不可用时返回随机数
         * 若 value 为 1，不可用时返回 0
         *
         * @param feature 功能名称
         * @param value   可用时的返回值
         * @return 可用返回 value，否则返回随机数
         */
        public static int hasFeature(String feature, int value) {
            return availableFeatures.contains(feature) ? value : (value == 1 ? 0 : new Random().nextInt());
        }
    }
}
