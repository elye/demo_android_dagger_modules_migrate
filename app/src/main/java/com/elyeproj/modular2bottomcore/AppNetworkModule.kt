package com.elyeproj.modular2bottomcore

import com.elyeproj.core.BaseNetwork
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppNetworkModule {
    @Provides
    @Singleton
    fun appNetworkModule(): BaseNetwork = AppNetwork("from AppNetworkModule")
}
