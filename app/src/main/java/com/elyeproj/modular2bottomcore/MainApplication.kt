package com.elyeproj.modular2bottomcore

import android.app.Application

class MainApplication: Application() {
    companion object {
        val baseComponent by lazy {
            DaggerMainComponent.create()
        }
    }
}
