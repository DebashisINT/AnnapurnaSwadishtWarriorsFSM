package com.breezefieldsalesannapurnaswadisht.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalesannapurnaswadisht.app.FileUtils
import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.NewQuotation.model.*
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.AddShopRequestData
import com.breezefieldsalesannapurnaswadisht.features.addshop.model.AddShopResponse
import com.breezefieldsalesannapurnaswadisht.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalesannapurnaswadisht.features.damageProduct.model.delBreakageReq
import com.breezefieldsalesannapurnaswadisht.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalesannapurnaswadisht.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalesannapurnaswadisht.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalesannapurnaswadisht.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}