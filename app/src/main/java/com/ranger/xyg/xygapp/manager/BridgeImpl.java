package com.ranger.xyg.xygapp.manager;

import android.webkit.WebView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by xyg on 2017/3/23.
 */

public class BridgeImpl implements IBridge {

    public static void showToast(WebView webView, JSONObject param, final Callback callback) {
        String message = param.optString("msg");
        Toast.makeText(webView.getContext(), message,Toast.LENGTH_SHORT).show();
        if (null != callback) {
            JSONObject object = new JSONObject();
            try {
                object.put("key", "value");
                object.put("key1", "value1");
                callback.apply(getJSONObject(0, "ok", object));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private static JSONObject getJSONObject(int code, String msg, JSONObject result) {
        JSONObject object = new JSONObject();
        try {
            object.put("code", code);
            object.put("msg", msg);
            object.putOpt("result", result);
            return object;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


}
