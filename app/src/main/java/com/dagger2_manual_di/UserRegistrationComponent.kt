package com.dagger2_manual_di

import android.provider.ContactsContract.CommonDataKinds.Email
import dagger.BindsInstance
import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    //    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}