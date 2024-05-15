package com.breezefieldsalesannapurnaswadisht.features.location.api

import com.breezefieldsalesannapurnaswadisht.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesannapurnaswadisht.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}