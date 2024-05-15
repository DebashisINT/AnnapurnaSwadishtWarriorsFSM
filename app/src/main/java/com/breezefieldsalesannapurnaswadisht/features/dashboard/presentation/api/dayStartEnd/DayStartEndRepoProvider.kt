package com.breezefieldsalesannapurnaswadisht.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}