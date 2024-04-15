package com.yurivital.projectmanager.ViewModel

import androidx.lifecycle.ViewModel
import com.yurivital.projectmanager.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {

    constructor():this(MainRepository())
    fun loadData() = repository.items
}