package com.dagger2_manual_di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("prem@gmail.com", "11111")

    }
}