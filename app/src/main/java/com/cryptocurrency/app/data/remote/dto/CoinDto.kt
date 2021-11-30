package com.cryptocurrency.app.data.remote.dto

import com.cryptocurrency.app.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("is_active")
	val isActive: Boolean,

	@field:SerializedName("is_new")
	val isNew: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rank")
	val rank: Int,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("type")
	val type: String,
)


fun CoinDto.toCoin(): Coin{
	return Coin(
		id = id,
		isActive = isActive,
		name = name,
		rank = rank,
		symbol = symbol
	)
}