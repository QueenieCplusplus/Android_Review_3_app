package com.katepatty.pk_downloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   /* override fun onStart() {
        super.onStart()

        //Navigation.findNavController(this,R.id.nav_host).navigate(R.id.YourFragment);
        it.findNavController().navigate(R.id.AFragment)
    }*/
}