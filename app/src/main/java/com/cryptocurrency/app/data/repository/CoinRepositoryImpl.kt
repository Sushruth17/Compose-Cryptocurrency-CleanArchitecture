package com.cryptocurrency.app.data.repository

import com.cryptocurrency.app.data.remote.CoinPapricaApi
import com.cryptocurrency.app.data.remote.dto.CoinDetailDto
import com.cryptocurrency.app.data.remote.dto.CoinDto
import com.cryptocurrency.app.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPapricaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}