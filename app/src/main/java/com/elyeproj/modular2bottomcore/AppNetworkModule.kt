package com.elyeproj.modular2bottomcore

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppNetworkModule {
    @Provides
    @Singleton
    fun appNetworkModule() = AppNetwork("from AppNetworkModule")
}
