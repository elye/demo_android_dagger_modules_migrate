package com.elyeproj.modular2bottomcore

import com.elyeproj.core.BaseApplication
import com.elyeproj.core.BaseSubComponent

class MainApplication: BaseApplication() {
    companion object {
        val baseComponent by lazy {
            DaggerMainComponent.create()
        }
    }

    override fun getBaseSubComponent(): BaseSubComponent {
        return baseComponent.baseSubComponent
    }
}
