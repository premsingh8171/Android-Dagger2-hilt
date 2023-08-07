package com.dagger2_manual_di

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService(): NotificationService {
        return MessageServie()
    }
}