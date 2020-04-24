package com.cheng.dagger2basic.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cheng.dagger2basic.BuildConfig
import com.cheng.dagger2basic.R
import com.cheng.dagger2basic.application.DaggerApplicationGraph
import com.cheng.dagger2basic.models.Info
import timber.log.Timber
import javax.inject.Inject

class FieldInjectionActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field_injection)
        DaggerApplicationGraph.create().inject(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.i("Info: ${info.text}")
    }
}
