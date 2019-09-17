package com.elyeproj.base

import dagger.Subcomponent


@Subcomponent
interface BaseSubComponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}
