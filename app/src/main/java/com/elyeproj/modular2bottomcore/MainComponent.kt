package com.elyeproj.modular2bottomcore

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppNetworkModule::class, AppRepositoryModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}
