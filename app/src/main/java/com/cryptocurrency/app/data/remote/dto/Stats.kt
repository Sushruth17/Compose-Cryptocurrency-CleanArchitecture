package com.cryptocurrency.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Stats(

	@field:SerializedName("followers")
	val followers: Int? = null,

	@field:SerializedName("contributors")
	val contributors: Int? = null,

	@field:SerializedName("stars")
	val stars: Int? = null,

	@field:SerializedName("subscribers")
	val subscribers: Int? = null
)