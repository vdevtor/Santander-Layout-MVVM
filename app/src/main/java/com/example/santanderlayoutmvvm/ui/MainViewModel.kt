package com.example.santanderlayoutmvvm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.santanderlayoutmvvm.data.Account
import com.example.santanderlayoutmvvm.data.local.FakeData

class MainViewModel: ViewModel() {
    private val mutableLiveData: MutableLiveData<Account> = MutableLiveData()

    fun getClientAccount(): LiveData<Account>{

        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}