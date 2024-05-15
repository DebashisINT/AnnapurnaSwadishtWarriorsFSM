package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.model

import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderColorEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderGenderEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderProductEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderSizeEntity
import com.breezefieldsalesannapurnaswadisht.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

