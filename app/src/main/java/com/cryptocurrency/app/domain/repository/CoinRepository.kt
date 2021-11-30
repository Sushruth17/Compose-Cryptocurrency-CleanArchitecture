package com.cryptocurrency.app.domain.repository

import com.cryptocurrency.app.data.remote.dto.CoinDetailDto
import com.cryptocurrency.app.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}