package com.breezefieldsalesannapurnaswadisht.features.meetinglist.model

import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.location.model.MeetingDurationDataModel
import java.io.Serializable

/**
 * Created by Saikat on 21-01-2020.
 */
class MeetingListResponseModel : BaseResponse(), Serializable {
    var meeting_list: ArrayList<MeetingDurationDataModel>? = null
}