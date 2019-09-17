package com.elyeproj.featureone

import com.elyeproj.base.BaseSubComponent
import dagger.Component

@Component(dependencies = [BaseSubComponent::class], modules = [FeatureOneDependentModule::class])
interface FeatureOneComponent {
    fun inject(featureOneActivity: FeatureOneActivity)
}
