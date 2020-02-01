package com.example.datasutram;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.Log;



public class DataCollection extends PhoneStateListener   {

    int ss = 0;
    TelephonyManager telephonyManager;


    @Override
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        ss = signalStrength.getGsmSignalStrength();
        ss = (2*ss) - 113;

        Log.i("Signal Strength " , String.valueOf(ss));
    }


}
