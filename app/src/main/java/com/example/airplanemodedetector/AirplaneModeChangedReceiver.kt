package com.example.airplanemodedetector

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state",false)?: return
        if(isAirPlaneModeEnabled)
        {
            Toast.makeText(context,"Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }

}