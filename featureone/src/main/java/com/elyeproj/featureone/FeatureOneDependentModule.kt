package com.elyeproj.featureone

import com.elyeproj.core.BaseNetwork
import com.elyeproj.core.BaseRepository
import dagger.Module
import dagger.Provides

@Module
class FeatureOneDependentModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        FeatureOneDependent("from FeatureOneDependentModule", baseRepository, baseNetwork)
}
