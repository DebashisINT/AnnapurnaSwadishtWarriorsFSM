package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.interf

import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderGenderEntity
import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}