package com.dagger2_manual_di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          val component = DaggerUserRegistrationComponent.builder().build()
//        val userRepository = UserRepository()
//        val emailService = EmailService()
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)


        val userRegistrationService= component.getUserRegistrationService()
        val emailService= component.getEmailService()
         userRegistrationService.registerUser("prem@gmail.com", "11111")

    }
}