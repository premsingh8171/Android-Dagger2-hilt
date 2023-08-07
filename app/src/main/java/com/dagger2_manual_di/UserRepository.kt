package com.dagger2_manual_di

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

// changes for future requirement we want to store database in firebase_BD don't want to store in SQl DB
// created interface class as name  UserRepository

interface UserRepository {
    fun saveUser(emai: String, password: String)
}

//store in SQl db
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(emai: String, password: String) {
        Log.d(TAG, "user save in db")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(emai: String, password: String) {
        Log.d(TAG, "User saved in db")
    }

}