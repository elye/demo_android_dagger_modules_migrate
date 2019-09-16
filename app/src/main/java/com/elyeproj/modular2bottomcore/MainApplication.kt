package com.elyeproj.modular2bottomcore

import com.elyeproj.core.BaseApplication

class MainApplication: BaseApplication() {
    companion object {
        val baseComponent by lazy {
            DaggerMainComponent.create()
        }
    }
}
