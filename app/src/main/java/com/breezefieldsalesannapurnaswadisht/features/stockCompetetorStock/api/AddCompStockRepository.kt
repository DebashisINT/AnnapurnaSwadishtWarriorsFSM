package com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.api

import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}