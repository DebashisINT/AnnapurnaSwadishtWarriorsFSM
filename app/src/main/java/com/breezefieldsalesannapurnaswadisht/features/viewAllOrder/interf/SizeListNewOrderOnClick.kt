package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.interf

import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderProductEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}