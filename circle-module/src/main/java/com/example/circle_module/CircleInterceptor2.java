package com.example.circle_module;

import com.drouter.api.interceptor.ActionInterceptor;
import com.drouter.api.thread.ActionPost;
import com.drouter.base.annotation.Interceptor;
import com.drouter.common.RouterConstants;

/**
 * description:
 * author: Darren on 2018/1/24 16:14
 * email: 240336124@qq.com
 * version: 1.0
 */
@Interceptor(priority = 10)
public class CircleInterceptor2 implements ActionInterceptor {

    @Override
    public void intercept(ActionChain chain) {
        ActionPost actionPost = chain.action();
        if (chain.actionPath().equals(RouterConstants.Circle.CIRCLE_ACTION)) {
            // 拦截
            chain.onInterrupt();
        }

        // 继续向下转发
        chain.proceed(actionPost);
    }
}
