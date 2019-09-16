package com.elyeproj.modular2bottomcore

import com.elyeproj.core.BaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppRepositoryModule {
    @Provides
    @Singleton
    fun appRepository(): BaseRepository = AppRepository("from AppRepositoryModule")
}
