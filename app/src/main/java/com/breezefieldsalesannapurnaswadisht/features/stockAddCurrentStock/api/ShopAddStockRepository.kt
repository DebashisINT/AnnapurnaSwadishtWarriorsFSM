package com.breezefieldsalesannapurnaswadisht.features.stockAddCurrentStock.api

import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesannapurnaswadisht.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesannapurnaswadisht.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesannapurnaswadisht.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}