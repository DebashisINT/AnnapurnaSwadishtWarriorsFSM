package com.breezefieldsalesannapurnaswadisht.features.login.model

import com.breezefieldsalesannapurnaswadisht.app.domain.AddShopSecondaryImgEntity


class GetSecImageUploadResponseModel {
    var status:String? = null
    var message:String? = null
    var lead_shop_list: ArrayList<AddShopSecondaryImgEntity>? = null
}