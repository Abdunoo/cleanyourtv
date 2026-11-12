package com.gathin.tvhome;

import android.view.KeyEvent;

final class PanelKeyFilter {
    private static final String PANEL_KEYPAD = "adc_keypad";

    private PanelKeyFilter() {
    }

    static boolean shouldDrop(String deviceName, int keyCode) {
        return PANEL_KEYPAD.equals(deviceName) && keyCode != KeyEvent.KEYCODE_POWER;
    }
}
