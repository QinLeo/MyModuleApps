package dream.jiandaopay.com.modulefirst;

import android.util.Log;

import com.leo.basemodule.ApplicationImpl;
import com.leo.basemodule.BaseApplication;

public class ModuleFirstApps implements ApplicationImpl {
    @Override
    public void onCreate(BaseApplication application) {
        Log.i("log_debug", "ModuleFirstApps");
    }
}
