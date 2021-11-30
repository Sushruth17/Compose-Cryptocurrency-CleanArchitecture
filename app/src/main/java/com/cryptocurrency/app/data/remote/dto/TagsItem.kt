package com.cryptocurrency.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TagsItem(

	@field:SerializedName("coin_counter")
	val coinCounter: Int? = null,

	@field:SerializedName("ico_counter")
	val icoCounter: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)