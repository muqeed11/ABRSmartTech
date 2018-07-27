package com.infraredcontrol.abrsmarttech

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
                        val i = Intent(this@MainActivity, Dashboard::class.java)
            startActivity(i)
            finish()
        }, 2000)

        }
}
