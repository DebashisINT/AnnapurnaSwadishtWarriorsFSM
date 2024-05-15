package com.breezefieldsalesannapurnaswadisht.features.contacts

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.breezedsm.app.domain.NewOrderDataEntity
import com.breezefieldsalesannapurnaswadisht.R
import com.breezefieldsalesannapurnaswadisht.app.AppDatabase
import com.breezefieldsalesannapurnaswadisht.app.domain.ActivityEntity
import com.breezefieldsalesannapurnaswadisht.app.utils.AppUtils
import com.breezefieldsalesannapurnaswadisht.features.orderITC.AdapterOrderList
import kotlinx.android.synthetic.main.inflate_datewise_activity_item.view.tv_activity
import kotlinx.android.synthetic.main.inflate_datewise_activity_item.view.tv_type
import kotlinx.android.synthetic.main.row_activity_dtls.view.iv_row_activity_view
import kotlinx.android.synthetic.main.row_activity_dtls.view.tv_row_acti_dtls
import kotlinx.android.synthetic.main.row_activity_dtls.view.tv_row_activity_activity
import kotlinx.android.synthetic.main.row_activity_dtls.view.tv_row_activity_date
import kotlinx.android.synthetic.main.row_activity_dtls.view.tv_row_activity_due_date
import kotlinx.android.synthetic.main.row_activity_dtls.view.tv_row_activity_type

class AdapterActivityDtls(var mContext: Context,var mList:ArrayList<ActivityEntity>,var listner: OnActionClick):
    RecyclerView.Adapter<AdapterActivityDtls.ActivityDtlsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityDtlsViewHolder {
        var v = LayoutInflater.from(mContext).inflate(R.layout.row_activity_dtls,parent,false)
        return ActivityDtlsViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ActivityDtlsViewHolder, position: Int) {
        holder.bindItems()
    }

    inner class ActivityDtlsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(){
            itemView.apply {
                try {
                    tv_row_activity_date.text = "Activity Date : "+AppUtils.convertToBillingFormat(mList.get(adapterPosition).date!!)+" "+mList.get(adapterPosition).time

                    val activity = AppDatabase.getDBInstance()?.activityDropdownDao()?.getSingleItem(mList?.get(adapterPosition)?.activity_dropdown_id!!)
                    if (!TextUtils.isEmpty(activity?.activity_name))
                        tv_row_activity_activity.text = activity?.activity_name
                    else
                        tv_row_activity_activity.text = "N.A."

                    val type = AppDatabase.getDBInstance()?.typeDao()?.getSingleType(mList?.get(adapterPosition)?.type_id!!)
                    if (!TextUtils.isEmpty(type?.name))
                        tv_row_activity_type.text = type?.name
                    else
                        tv_row_activity_type.text = "N.A."

                    if(mList?.get(adapterPosition)?.due_date.isNullOrEmpty()){
                        tv_row_activity_due_date.text = "N.A."
                    }else{
                        tv_row_activity_due_date.text = AppUtils.convertToBillingFormat(mList.get(adapterPosition).due_date!!)
                    }

                    if(mList?.get(adapterPosition)?.details.isNullOrEmpty()){
                        tv_row_acti_dtls.text = "N.A."
                    }else{
                        tv_row_acti_dtls.text = mList?.get(adapterPosition)?.details
                    }

                    iv_row_activity_view.setOnClickListener {
                        listner.onViewClick(mList?.get(adapterPosition))
                    }

                }catch (ex:Exception){
                    ex.printStackTrace()
                }

            }
        }
    }

    interface OnActionClick {
        fun onViewClick(obj: ActivityEntity)
    }

}