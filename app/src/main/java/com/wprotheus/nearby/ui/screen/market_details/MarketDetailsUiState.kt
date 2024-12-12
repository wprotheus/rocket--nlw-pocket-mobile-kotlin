package com.wprotheus.nearby.ui.screen.market_details

import com.wprotheus.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)