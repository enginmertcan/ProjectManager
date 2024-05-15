package com.example.projectmanagerproject.Repository

import com.example.projectmanagerproject.Domain.TeamDomain

class ProfileRepository {

    val myteamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in Progress"),
        TeamDomain("Kotlin developers", "Completed")
    )

    val archiveItems: MutableList<String> = mutableListOf(
        "UI/UX ScreenShot",
        "Kotlin Source Code",
        "Source Codes"
    )

}