package com.breezefieldsalesannapurnaswadisht.features.document.api

import com.breezefieldsalesannapurnaswadisht.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesannapurnaswadisht.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}