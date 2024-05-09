package org.schabi.newpipelegacy.util;

import org.schabi.newpipelegacy.App;

public class FireTvUtils {
    public static boolean isFireTv(){
        final String AMAZON_FEATURE_FIRE_TV = "amazon.hardware.fire_tv";
        return App.getApp().getPackageManager().hasSystemFeature(AMAZON_FEATURE_FIRE_TV);
    }
}
