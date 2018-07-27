package com.infraredcontrol.abrsmarttech

import android.hardware.ConsumerIrManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_dashboard.*
import android.content.Context
import android.support.v7.app.AlertDialog


class Dashboard : AppCompatActivity() {


    val frequency = 2000
    val pattern: IntArray = intArrayOf(714)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val IR = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
        bulb1.setOnClickListener {
            println("bulb1 clicked"  )
            println(pattern )
            bulb1.setImageResource(R.mipmap.on2)
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)

            Handler().postDelayed({
                bulb1.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,159482)

        }
        bulb2.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb2.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb2.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1443664253)
        }
        bulb3.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb3.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb3.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1248739308)
        }
        bulb4.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb4.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb4.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1400839614)
        }


        // next line
        bulb5.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb5.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb5.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1519836740)
        }
        bulb6.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb6.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb6.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1304526529)
        }
        bulb7.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb7.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb7.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1550403580)
        }
        bulb8.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            bulb8.setImageResource(R.mipmap.on2)
            Handler().postDelayed({
                bulb8.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,1798065458)
        }
        shutdown.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            CheckInfraredonDevice(IR,1508956117)

        }

        signal.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)

        }


    }
    fun CheckInfraredonDevice(IR:ConsumerIrManager,freq:Int) {
        if (!IR.hasIrEmitter()) {
            println(freq)
            println(pattern)
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ARB Infrared")
        builder.setMessage("No Infrared found on this device..!!")
        builder.setNeutralButton("OK") { dialog, which -> null }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
        else {
            IR.transmit(freq, pattern)

        }


    }


}
