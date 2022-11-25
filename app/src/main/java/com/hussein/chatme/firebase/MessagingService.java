package com.hussein.chatme.firebase;


import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/*
Make sure you copy the service tag which contains 'com.google.firebase.MESSAGING_EVENT'.
i Copied this service from tools => firebase => cloud Messaging (then scroll down)
then put which i copied in the manifest
 */

public class MessagingService extends FirebaseMessagingService {

    /*
    For now, we;re just printing token and remote message, in order to chek whether Firebase
    cloud messaging is set yp correctly or not
     */
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

    }
}
