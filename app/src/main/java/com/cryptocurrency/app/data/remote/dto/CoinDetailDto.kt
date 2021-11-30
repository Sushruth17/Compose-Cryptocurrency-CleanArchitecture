package com.cryptocurrency.app.data.remote.dto

import com.cryptocurrency.app.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailDto(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("is_active")
	val isActive: Boolean,

	@field:SerializedName("is_new")
	val isNew: Boolean,

	@field:SerializedName("proof_type")
	val proofType: String,

	@field:SerializedName("first_data_at")
	val firstDataAt: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("team")
	val team: List<TeamMember>,

	@field:SerializedName("links_extended")
	val linksExtended: List<LinksExtendedItem>,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("tags")
	val tags: List<TagsItem>,

	@field:SerializedName("last_data_at")
	val lastDataAt: String,

	@field:SerializedName("whitepaper")
	val whitepaper: Whitepaper,

	@field:SerializedName("org_structure")
	val orgStructure: String,

	@field:SerializedName("hardware_wallet")
	val hardwareWallet: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("development_status")
	val developmentStatus: String,

	@field:SerializedName("hash_algorithm")
	val hashAlgorithm: String,

	@field:SerializedName("rank")
	val rank: Int,

	@field:SerializedName("started_at")
	val startedAt: String,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("open_source")
	val openSource: Boolean
)

fun CoinDetailDto.toCoinDetail(): CoinDetail{
	return CoinDetail(
		coinId = id,
		name = name,
		description = description,
		symbol = symbol,
		rank = rank,
		isActive = isActive,
		team = team,
		tags = tags.map { it.name!! }
	)
}