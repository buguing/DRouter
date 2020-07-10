package com.main.module;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.drouter.api.core.DRouter;
import com.drouter.api.result.ActionCallback;
import com.drouter.api.result.RouterResult;
import com.drouter.common.RouterConstants;

/**
 * description:
 * author: Darren on 2018/1/22 09:43
 * email: 240336124@qq.com
 * version: 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpLogin(View view) {
        DRouter.getInstance()
                .action(RouterConstants.Login.LOGIN_ACTION)
                .context(this)
                .param("key", "value")
                .invokeAction();
    }

    public void jumpCircle(View view) {
        DRouter.getInstance()
                .action(RouterConstants.Circle.CIRCLE_ACTION)
                .context(this)
                .param("key", "value")
                .invokeAction(new ActionCallback() {
                    @Override
                    public void onInterrupt() {
                        Log.e("TAG", "被拦截了");
                    }

                    @Override
                    public void onResult(RouterResult result) {
                        Log.e("TAG", "result = " + result.toString());
                    }
                });
    }
}
