package com.dagger2_manual_di

import android.provider.ContactsContract.CommonDataKinds.Email
import dagger.Component


@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService(): EmailService
}