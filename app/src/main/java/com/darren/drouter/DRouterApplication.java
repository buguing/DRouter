package com.darren.drouter;

import com.drouter.api.core.DRouter;
import com.drouter.common.BaseApplication;

/**
 * description:
 * author: Darren on 2018/1/22 11:27
 * email: 240336124@qq.com
 * version: 1.0
 */
public class DRouterApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        DRouter.openDebug();
        DRouter.getInstance().init(this);
    }
}
