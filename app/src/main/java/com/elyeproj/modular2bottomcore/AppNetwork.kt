package com.elyeproj.modular2bottomcore

import com.elyeproj.base.BaseNetwork

class AppNetwork(val name: String): BaseNetwork {
    override fun toString(): String {
        return "AppNetwork $name ${super.toString()} "
    }
}
