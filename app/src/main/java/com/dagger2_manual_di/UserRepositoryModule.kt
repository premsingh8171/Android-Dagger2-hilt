package com.dagger2_manual_di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    //using with @Provides Annotation
//    this function will return FirebaseRepository and save the data in firebase
//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    // this function will return sqlRepository and save the data in sql db
//    @Provides
//    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository {
//        return sqlRepository
//    }

    //Using with @Binds Annotation

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}