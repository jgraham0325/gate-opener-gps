package com.jgraham.gateopener.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.jgraham.gateopener.services.GeofenceTrasitionService;

/**
 * Created by James on 04/02/2017.
 */

public class StartGateOpenerServiceAtBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent serviceIntent = new Intent(context, GeofenceTrasitionService.class);
            context.startService(serviceIntent);
        }
    }
}
