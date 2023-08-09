package com.dagger2_manual_di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}