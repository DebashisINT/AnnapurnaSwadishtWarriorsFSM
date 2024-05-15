package com.breezefieldsalesannapurnaswadisht.features.stockAddCurrentStock.api

import com.breezefieldsalesannapurnaswadisht.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesannapurnaswadisht.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}