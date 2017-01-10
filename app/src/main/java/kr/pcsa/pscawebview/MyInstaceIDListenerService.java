package kr.pcsa.pscawebview;

import android.util.Log;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

import org.json.JSONException;
import org.json.JSONObject;

public class MyInstaceIDListenerService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
//        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        // 이 token을 서버에 전달 한다.
        AQuery aq = new AQuery(this);


        try {
            JSONObject json = new JSONObject();
            json.put("a", "b");

            aq.post("", json, JSONObject.class, new AjaxCallback<JSONObject>(){
                @Override
                public void callback(String url, JSONObject object, AjaxStatus status) {
                    if(status.getCode() == 200) {
                        Log.d("ldk", object.toString());
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
