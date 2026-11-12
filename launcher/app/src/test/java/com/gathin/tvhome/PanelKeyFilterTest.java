package com.gathin.tvhome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PanelKeyFilterTest {
    private static final int DPAD_UP = 19;
    private static final int POWER = 26;

    @Test
    public void dropsDirectionKeyFromPanelKeypad() {
        assertTrue(PanelKeyFilter.shouldDrop("adc_keypad", DPAD_UP));
    }

    @Test
    public void keepsPowerKeyFromPanelKeypad() {
        assertFalse(PanelKeyFilter.shouldDrop("adc_keypad", POWER));
    }

    @Test
    public void keepsDirectionKeyFromRemote() {
        assertFalse(PanelKeyFilter.shouldDrop("Xiaomi RC", DPAD_UP));
    }

    @Test
    public void keepsKeyWhenDeviceIsUnknown() {
        assertFalse(PanelKeyFilter.shouldDrop(null, DPAD_UP));
    }
}
