package dream.jiandaopay.com.modulefirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/abc/modules/first")
public class TestModuleFirstActivity extends Activity {
    @Autowired(name = "key_text")
    public String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_first_layout);
        ARouter.getInstance().inject(this);

        TextView module_first_tv = findViewById(R.id.module_first_tv);
        module_first_tv.setText(text);

        startActivity(new Intent(this,ModuleFirstApps.class));
    }
}
