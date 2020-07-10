package com.drouter.common;

public interface RouterConstants {
    interface Login {
        String PREFIX = "loginmodule";
        String LOGIN_ACTION = PREFIX + "/action";
    }

    interface Circle {
        String PREFIX = "circlemodule";
        String CIRCLE_ACTION = PREFIX + "/action";
    }
}
