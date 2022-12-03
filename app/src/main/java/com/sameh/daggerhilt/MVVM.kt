package com.sameh.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MVVM @Inject constructor(
    @Named("fourName") fourName: String
) : ViewModel() {

    init {
        Log.d("myTAG", "name4: $fourName")
    }

}