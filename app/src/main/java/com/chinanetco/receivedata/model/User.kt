package com.chinanetco.datareceiver.model
import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class User(val name: String, val id: String)