package com.elyeproj.modular2bottomcore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.elyeproj.core.BaseNetwork
import com.elyeproj.core.BaseRepository
import com.elyeproj.featureone.FeatureOneActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appNetwork: BaseNetwork

    @Inject
    lateinit var appRepository: BaseRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainApplication.baseComponent.inject(this)

        txt_result.text = "I have get my dependents from\n$appRepository and\n$appNetwork"

        button_one.setOnClickListener {
            startActivity(Intent(this, FeatureOneActivity::class.java))
        }
    }
}
