package com.learning.bean;

import java.util.concurrent.Callable;

/**
 * ClassName:CallAableThread
 * Package:com.learning.bean
 * Description:
 * Date:2019/4/27 22:57
 * Author:13651027050
 */
public class CallAableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1;
    }
}
