package com.dagger2_manual_di

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@email.com", "User Registered")
    }
}

/*
* Unit testing
* Single Responsibility
* Lifetime of these Objects
* Extensible
* */