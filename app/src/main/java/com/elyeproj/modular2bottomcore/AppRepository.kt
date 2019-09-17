package com.elyeproj.modular2bottomcore

import com.elyeproj.base.BaseRepository

class AppRepository(val name: String): BaseRepository {
    override fun toString(): String {
        return "AppRepository $name ${super.toString()} "
    }
}
