package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.orderOptimized

import com.breezefieldsalesannapurnaswadisht.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}