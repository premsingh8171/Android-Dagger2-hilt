package com.dagger2_manual_di

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@email.com", "User Registered")
    }
}

/*
* Unit testing
* Single Responsibility
* Lifetime of these Objects
* Extensible
* */