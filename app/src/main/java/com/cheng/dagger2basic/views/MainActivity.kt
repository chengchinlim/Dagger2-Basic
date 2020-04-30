package com.cheng.dagger2basic.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cheng.dagger2basic.BuildConfig
import com.cheng.dagger2basic.R
import com.cheng.dagger2basic.applications.MyApplication
import com.cheng.dagger2basic.models.Info
import com.cheng.dagger2basic.models.Vehicle
import com.cheng.dagger2basic.network.TestApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info
    @Inject
    lateinit var vehicle: Vehicle
    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication().getMyComponent().inject(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.i("Info: ${info.text}")
        vehicle.printVehicleAttributes()

        CoroutineScope(Dispatchers.IO).launch {
            val testApi = retrofit.create(TestApi::class.java)
            val response = testApi.getPosts()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful && response.body() != null) {
                    val posts = response.body()!!
                    for (p in posts) {
                        Timber.i("Post: $p")
                    }
                 }
            }
        }
    }
}
