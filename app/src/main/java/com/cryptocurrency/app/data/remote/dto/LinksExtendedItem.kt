package com.cryptocurrency.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class LinksExtendedItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("stats")
	val stats: Stats? = null
)