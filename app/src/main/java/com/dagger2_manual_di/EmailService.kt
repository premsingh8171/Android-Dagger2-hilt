package com.dagger2_manual_di

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Email Sent")
    }
}

class MessageServie : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message Sent")


    }

}