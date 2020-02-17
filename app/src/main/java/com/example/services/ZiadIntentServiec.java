package com.example.services;

import android.app.IntentService;
import android.content.Intent;

public class ZiadIntentServiec extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public ZiadIntentServiec(String name) {
        super("Ziad_Zayed");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
