package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.interf

import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderColorEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}