package com.cryptocurrency.app.domain.use_case.get_coin

import com.cryptocurrency.app.common.Resource
import com.cryptocurrency.app.data.remote.dto.toCoin
import com.cryptocurrency.app.data.remote.dto.toCoinDetail
import com.cryptocurrency.app.domain.model.Coin
import com.cryptocurrency.app.domain.model.CoinDetail
import com.cryptocurrency.app.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(coinId: String) = flow<Resource<CoinDetail>> {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        }
        catch (e: HttpException){
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured"))
        }
        catch (e: IOException){
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection"))
        }
    }
}