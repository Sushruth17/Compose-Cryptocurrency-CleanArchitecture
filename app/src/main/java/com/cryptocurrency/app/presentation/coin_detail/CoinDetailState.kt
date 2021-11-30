package com.cryptocurrency.app.presentation.coin_detail

import com.cryptocurrency.app.domain.model.Coin
import com.cryptocurrency.app.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
