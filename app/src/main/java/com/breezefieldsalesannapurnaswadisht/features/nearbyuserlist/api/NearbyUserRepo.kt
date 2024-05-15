package com.breezefieldsalesannapurnaswadisht.features.nearbyuserlist.api

import com.breezefieldsalesannapurnaswadisht.app.Pref
import com.breezefieldsalesannapurnaswadisht.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesannapurnaswadisht.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesannapurnaswadisht.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}