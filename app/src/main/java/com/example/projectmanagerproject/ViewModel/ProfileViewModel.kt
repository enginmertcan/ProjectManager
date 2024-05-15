package com.example.projectmanagerproject.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanagerproject.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository):ViewModel() {
    constructor(): this(ProfileRepository())

    fun loadDataMyteam()=repository.myteamItems
    fun loadDataArchive()=repository.archiveItems
}