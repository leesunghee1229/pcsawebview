package kr.pcsa.pscawebview;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFcmListenerService extends FirebaseMessagingService {

    public static String TAG = "FCM";

        @Override
    public void onMessageReceived(RemoteMessage message) {
//        String from = message.getFrom();
//        Map<String, String> data = message.getData();
//        String title = data.get("title");
//        String msg = data.get("message");
//        String body = data.get("body");

        // 전달 받은 정보로 뭔가를 하면 된다.

//        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + message.getFrom());

        // Check if message contains a data payload.
        if (message.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + message.getData());
        }

        String title = "" , msg = "";

        // Check if message contains a notification payload.
        if (message.getNotification() != null) {
            Log.d(TAG, "Message Notification 1: " + message.getNotification().getBody());
            Log.d(TAG, "Message Notification 2: " + message.getNotification().getTitle());

            title = message.getNotification().getTitle();
            msg = message.getNotification().getTitle();
        }

        sendNotification(title,msg);
//        sendNotification(remoteMessage.getData().get("title"),remoteMessage.getData().get("body"));

//        showNoti(getApplicationContext(), title, msg);

        /*
        http://blog.naver.com/zic325/220719729251
         */
    }

    private void sendNotification(String messageTitle,String messageBody) {

        try {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            PendingIntent pendingIntent = PendingIntent.getActivity(this,0 /* request code */, intent,PendingIntent.FLAG_UPDATE_CURRENT);

            long[] pattern = {500,500,500,500,500};

            Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                    .setContentTitle(messageTitle)
                    .setContentText(messageBody)
                    .setAutoCancel(true)
                    .setVibrate(pattern)
                    .setSound(defaultSoundUri)
                    .setContentIntent(pendingIntent);

            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
        }
        catch (Exception ignored) {

        }

    }



}
