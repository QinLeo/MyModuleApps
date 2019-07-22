package com.leo.mymoduleapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
//        startActivity(new Intent(this, TestModuleFirstActivity.class));
        TextView btn_jump_module_first = findViewById(R.id.btn_jump_module_first);
        btn_jump_module_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ARouter.getInstance().build("/modules/main/test")
//                        .withString("key_text", "跨模块传参")
//                        .navigation();
                ARouter.getInstance().build("/abc/modules/first")
                        .withString("key_text","跨模块传参")
                        .navigation(MainActivity.this,new NavCallback() {

                            @Override
                            public void onFound(Postcard postcard) {
                                Log.e("zhao", "onArrival: 找到了 ");
                            }

                            @Override
                            public void onLost(Postcard postcard) {
                                Log.e("zhao", "onArrival: 找不到了 ");
                            }

                            @Override
                            public void onArrival(Postcard postcard) {
                                Log.e("zhao", "onArrival: 跳转完了 ");
                            }

                            @Override
                            public void onInterrupt(Postcard postcard) {
                                Log.e("zhao", "onArrival: 被拦截了 ");
                            }
                        });
            }
        });
    }


    private String getMyUUID() {
        UUID uuid = UUID.randomUUID();
        String uniqueId = uuid.toString();
        Log.d("uuid_debug", "----->UUID" + uuid);
        return uniqueId;

    }
}
