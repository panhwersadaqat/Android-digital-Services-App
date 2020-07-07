package com.thefuturestic.digitalservices

import android.app.Application
import com.google.firebase.database.FirebaseDatabase

class DigitalServices : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}