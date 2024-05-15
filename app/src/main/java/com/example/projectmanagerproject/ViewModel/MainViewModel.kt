package com.example.projectmanagerproject.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagerproject.Repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {
    constructor() : this(MainRepository())

    fun loadData() = repository.items
}