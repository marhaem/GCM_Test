package com.example.marhaem.gcm_test;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by marhaem on 022, 22.02..
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService
{
    private static final String TAG = "MyInstanceIDListenerService";

    /**
     * Method is called, when the registration token is updated.
     * For security reasons a compromised token has to be refreshed.
     * Call is initiated by InstanceID provider
     */
    @Override
    public void onTokenRefresh()
    {
        // @TODO: Fetch updated instance token and notify app-server of any changes
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
