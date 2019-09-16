package com.elyeproj.modular2bottomcore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appNetwrok: AppNetwork

    @Inject
    lateinit var appRepository: AppRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainApplication.baseComponent.inject(this)

        txt_result.text = "I have get my dependents from\n$appNetwrok and\n$appRepository"
    }
}
