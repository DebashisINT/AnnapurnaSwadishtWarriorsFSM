package com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.interf

import com.breezefieldsalesannapurnaswadisht.app.domain.NewOrderGenderEntity
import com.breezefieldsalesannapurnaswadisht.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}