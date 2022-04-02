package com.ekhasm.receipttracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false
    }

    fun openCamera() {

    }
}