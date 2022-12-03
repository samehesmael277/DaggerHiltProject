package com.sameh.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
object ViewModule {

    @ViewModelScoped
    @Provides
    @Named("fourName")
    fun provideGetFourName(): String {
        return "Younes Esmael"
    }

}