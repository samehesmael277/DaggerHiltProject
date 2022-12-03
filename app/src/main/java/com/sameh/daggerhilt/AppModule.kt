package com.sameh.daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("firstName")
    fun provideGetFirstName(): String {
        return "Sameh Esmael"
    }

    @Singleton
    @Provides
    @Named("secondName")
    fun provideGetSecondName(): String {
        return "Ahmed Esmael"
    }

    @Singleton
    @Provides
    @Named("thirdName")
    fun provideGetThirdName(@ApplicationContext context: Context): String {
        return context.getString(R.string.third_name)
    }

}