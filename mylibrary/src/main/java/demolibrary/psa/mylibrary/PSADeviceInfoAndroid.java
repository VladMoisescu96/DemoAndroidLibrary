package demolibrary.psa.mylibrary;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

public class PSADeviceInfoAndroid {

    private static PSADeviceInfoAndroid instance = null;

    public static PSADeviceInfoAndroid getInstance() {
        if (instance == null)
            instance = new PSADeviceInfoAndroid();

        return instance;
    }

    public String deviceFamily() {
        return "Android";
    }

    public String deviceVendor() {
        return android.os.Build.MANUFACTURER;
    }


    public String deviceModel() {
        return android.os.Build.MODEL;
    }

    public String deviceId() {
        return Build.ID;
    }

    public String osName() {
        return Build.VERSION_CODES.class.getFields()[android.os.Build.VERSION.SDK_INT].getName();
    }

    public String osVersion() {
        return Build.VERSION.RELEASE;
    }

    public String mobileInstanceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);

    }
}
