package com.breezefieldsalesannapurnaswadisht.features.activities.api

import com.breezefieldsalesannapurnaswadisht.features.member.api.TeamApi
import com.breezefieldsalesannapurnaswadisht.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}