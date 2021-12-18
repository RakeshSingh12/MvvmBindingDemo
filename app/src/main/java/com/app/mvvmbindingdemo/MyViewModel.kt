package com.app.mvvmbindingdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

    public val data:MutableLiveData<Model> by lazy {
        MutableLiveData<Model>()
    }

    public fun setData(model:Model){
        data.value=model
    }

}