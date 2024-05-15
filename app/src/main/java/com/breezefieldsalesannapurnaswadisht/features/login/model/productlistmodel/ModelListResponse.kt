package com.breezefieldsalesannapurnaswadisht.features.login.model.productlistmodel

import com.breezefieldsalesannapurnaswadisht.app.domain.ModelEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.ProductListEntity
import com.breezefieldsalesannapurnaswadisht.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}