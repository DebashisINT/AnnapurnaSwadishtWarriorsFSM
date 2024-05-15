package com.breezefieldsalesannapurnaswadisht.features.newcollectionreport

import com.breezefieldsalesannapurnaswadisht.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}