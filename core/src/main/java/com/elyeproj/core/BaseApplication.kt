package com.elyeproj.core

import android.app.Application

abstract class  BaseApplication: Application() {
    abstract fun getBaseSubComponent(): BaseSubComponent
}
