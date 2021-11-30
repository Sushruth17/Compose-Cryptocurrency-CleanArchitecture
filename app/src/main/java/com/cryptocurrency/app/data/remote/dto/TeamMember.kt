package com.cryptocurrency.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TeamMember(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("position")
	val position: String
)