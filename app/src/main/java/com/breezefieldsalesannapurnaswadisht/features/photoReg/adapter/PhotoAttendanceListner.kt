package com.breezefieldsalesannapurnaswadisht.features.photoReg.adapter

import com.breezefieldsalesannapurnaswadisht.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}