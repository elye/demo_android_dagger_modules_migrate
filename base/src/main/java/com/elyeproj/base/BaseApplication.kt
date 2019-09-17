package com.elyeproj.base

import android.app.Application

abstract class  BaseApplication: Application() {
    abstract fun getBaseSubComponent(): BaseSubComponent
}
