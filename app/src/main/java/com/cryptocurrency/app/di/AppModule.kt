package com.cryptocurrency.app.di

import com.cryptocurrency.app.common.Constants
import com.cryptocurrency.app.data.remote.CoinPapricaApi
import com.cryptocurrency.app.data.repository.CoinRepositoryImpl
import com.cryptocurrency.app.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPapricaApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPapricaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPapricaApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }
}