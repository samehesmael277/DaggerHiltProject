package com.sameh.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("firstName")
    lateinit var name_1: String

    @Inject
    @Named("secondName")
    lateinit var name_2: String

    @Inject
    @Named("thirdName")
    lateinit var name_3: String

    val mvvm: MVVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("myTAG", "name1: $name_1")
        Log.d("myTAG", "name2: $name_2")
        Log.d("myTAG", "name3: $name_3")

        mvvm
    }
}