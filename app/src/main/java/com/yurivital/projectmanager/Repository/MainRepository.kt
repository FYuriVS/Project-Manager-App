package com.yurivital.projectmanager.Repository

import com.yurivital.projectmanager.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Food App","June 12, 2024",50,"ongoing1"),
        OngoingDomain("AI Recoding","June 26, 2024",60,"ongoing2"),
        OngoingDomain("Weather App","June 22, 2024",25,"ongoing3"),
        OngoingDomain("E-Book App","June 13, 2024",80,"ongoing4")
    )
}