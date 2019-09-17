package com.elyeproj.modular2bottomcore

import com.elyeproj.base.BaseApplication
import com.elyeproj.base.BaseSubComponent

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
