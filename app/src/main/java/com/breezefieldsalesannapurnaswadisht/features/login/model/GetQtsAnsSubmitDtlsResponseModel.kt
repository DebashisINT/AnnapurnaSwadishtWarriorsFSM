package com.breezefieldsalesannapurnaswadisht.features.login.model

import com.breezefieldsalesannapurnaswadisht.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}