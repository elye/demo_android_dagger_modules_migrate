package com.elyeproj.core

import dagger.Subcomponent


@Subcomponent
interface BaseSubComponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}
