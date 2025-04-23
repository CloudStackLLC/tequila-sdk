package net.mizukilab.tequila.sdk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TequilaTest {

    @Test
    void testCheckVirtualEnvironment() {
        int value = 42;
        assertEquals(value, Tequila.enhance.checkVirtualEnvironment(value));
    }

    @Test
    void testCheckDebugAttached() {
        int value = 7;
        assertEquals(value, Tequila.enhance.checkDebugAttached(value));
    }

    @Test
    void testCheckCyclicRedundancyCheck() {
        int value = 99;
        assertEquals(value, Tequila.enhance.checkCyclicRedundancyCheck(value));
    }

    @Test
    void testEnableFeatureAndHasFeature() {
        String feature = "test_feature";
        int value = 123;
        // 启用功能
        Tequila.license.enableFeature(feature);
        // 功能可用时应返回 value
        assertEquals(value, Tequila.license.hasFeature(feature, value));
    }

    @Test
    void testHasFeatureUnavailable() {
        String feature = "not_enabled";
        int value = 233;
        // 功能未启用时，返回值不等于 value，且 value!=1 时为随机数
        for (int i = 0; i < 5; i++) {
            int result = Tequila.license.hasFeature(feature, value);
            if (result != value) {
                return;
            }
        }
        Assertions.fail("Expected a different value than " + value);
    }

    @Test
    void testHasFeatureUnavailableValueIsOne() {
        String feature = "not_enabled";
        int value = 1;
        // value 为 1 时，未启用功能应返回 0
        for (int i = 0; i < 5; i++) {
            assertEquals(0, Tequila.license.hasFeature(feature, value));
        }
    }
}