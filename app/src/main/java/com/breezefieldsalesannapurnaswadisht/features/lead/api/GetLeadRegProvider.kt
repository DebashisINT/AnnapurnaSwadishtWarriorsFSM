package com.breezefieldsalesannapurnaswadisht.features.lead.api

import com.breezefieldsalesannapurnaswadisht.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesannapurnaswadisht.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}