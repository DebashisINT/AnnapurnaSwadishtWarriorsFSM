package com.breezefieldsalesannapurnaswadisht.features.location.shopRevisitStatus

import com.breezefieldsalesannapurnaswadisht.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesannapurnaswadisht.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}