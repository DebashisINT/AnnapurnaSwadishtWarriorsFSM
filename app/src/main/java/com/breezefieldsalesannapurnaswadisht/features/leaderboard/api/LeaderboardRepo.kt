package com.breezefieldsalesannapurnaswadisht.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesannapurnaswadisht.app.FileUtils
import com.breezefieldsalesannapurnaswadisht.app.Pref
import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.AddLogReqData
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.AddShopRequestData
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.AddShopResponse
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.LogFileResponse
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesannapurnaswadisht.features.contacts.CallHisDtls
import com.breezefieldsalesannapurnaswadisht.features.contacts.CompanyReqData
import com.breezefieldsalesannapurnaswadisht.features.contacts.ContactMasterRes
import com.breezefieldsalesannapurnaswadisht.features.contacts.SourceMasterRes
import com.breezefieldsalesannapurnaswadisht.features.contacts.StageMasterRes
import com.breezefieldsalesannapurnaswadisht.features.contacts.StatusMasterRes
import com.breezefieldsalesannapurnaswadisht.features.contacts.TypeMasterRes
import com.breezefieldsalesannapurnaswadisht.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesannapurnaswadisht.features.login.model.WhatsappApiData
import com.breezefieldsalesannapurnaswadisht.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}