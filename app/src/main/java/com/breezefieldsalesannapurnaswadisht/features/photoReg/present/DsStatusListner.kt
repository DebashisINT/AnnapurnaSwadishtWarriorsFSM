package com.breezefieldsalesannapurnaswadisht.features.photoReg.present

import com.breezefieldsalesannapurnaswadisht.app.domain.ProspectEntity
import com.breezefieldsalesannapurnaswadisht.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}