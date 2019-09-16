package com.elyeproj.modular2bottomcore

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppRepositoryModule {
    @Provides
    @Singleton
    fun appRepository() = AppRepository("from AppRepositoryModule")
}
