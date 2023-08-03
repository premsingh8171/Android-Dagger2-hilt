package com.dagger2_manual_di

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(emai:String,password:String){
        Log.d(TAG,"user save in db")
    }
}