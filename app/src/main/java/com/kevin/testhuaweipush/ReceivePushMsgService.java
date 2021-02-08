package com.kevin.testhuaweipush;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;

/**
 * @author Kevin  2021/2/8
 */
public class ReceivePushMsgService extends HmsMessageService {
    private static final String TAG = "ReceivePushMsgService";

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e(TAG, "onNewToken: " + s);
    }

    @Override
    public void onTokenError(Exception e) {
        super.onTokenError(e);
        Log.e(TAG, "onTokenError: " + e.toString());
    }
}
