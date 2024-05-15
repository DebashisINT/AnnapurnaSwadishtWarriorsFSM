package com.breezefieldsalesannapurnaswadisht.features.login.api.alarmconfigapi

import com.breezefieldsalesannapurnaswadisht.app.Pref
import com.breezefieldsalesannapurnaswadisht.features.login.model.alarmconfigmodel.AlarmConfigResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 19-02-2019.
 */
class AlarmConfigRepo(val apiService: AlarmConfigApi) {
    fun alarmConfig(): Observable<AlarmConfigResponseModel> {
        return apiService.alarmConfigResponse(Pref.session_token!!, Pref.user_id!!)
    }
}