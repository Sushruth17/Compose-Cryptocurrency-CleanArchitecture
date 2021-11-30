package com.cryptocurrency.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Whitepaper(

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("link")
	val link: String? = null
)