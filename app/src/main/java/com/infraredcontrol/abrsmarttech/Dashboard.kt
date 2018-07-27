package com.infraredcontrol.abrsmarttech

import android.hardware.ConsumerIrManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_dashboard.*
import android.content.Context
import android.os.*
import android.support.v7.app.AlertDialog
import android.util.SparseArray




class Dashboard : AppCompatActivity() {


    private val irData: SparseArray<String>? = null
    private val pattern = intArrayOf(1901, 4453, 625, 1614, 625, 1588, 625, 1614, 625, 442, 625, 442, 625, 468, 625, 442, 625, 494, 572, 1614, 625, 1588, 625, 1614, 625, 494, 572, 442, 651, 442, 625, 442, 625, 442, 625, 1614, 625, 1588, 651, 1588, 625, 442, 625, 494, 598, 442, 625, 442, 625, 520, 572, 442,
            625, 442, 625, 442, 651, 1588, 625, 1614, 625, 1588, 625, 1614, 625, 1588, 625, 48958)
//    val frequency = 2000
   // val pattern: IntArray = intArrayOf(714)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val IR = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
        bulb1.setOnClickListener {
            bulb1.setImageResource(R.mipmap.on2)
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            Handler().postDelayed({
                bulb1.setImageResource(R.mipmap.off2)
            }, 500)
            CheckInfraredonDevice(IR,38000)

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
            CheckInfraredonDevice(IR,39000)
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
            CheckInfraredonDevice(IR,40000)
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
            CheckInfraredonDevice(IR,41000)
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
            CheckInfraredonDevice(IR,38000)
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
            CheckInfraredonDevice(IR,38000)
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
            CheckInfraredonDevice(IR,38000)
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
            CheckInfraredonDevice(IR,38000)
        }

        fanoff.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            CheckInfraredonDevice(IR,38000)
        }

        minus.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            CheckInfraredonDevice(IR,38000)
        }

        plus.setOnClickListener{
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            CheckInfraredonDevice(IR,38000)
        }

        shutdown.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)
            CheckInfraredonDevice(IR,60000)

        }

        signal.setOnClickListener {
            signal.visibility = View.VISIBLE
            Handler().postDelayed({
                signal.visibility = View.INVISIBLE
            }, 10)

        }


    }
    fun CheckInfraredonDevice(IR:ConsumerIrManager,freq:Int) {
         val pattern1 = intArrayOf(1901, 4453, 625, 1614, 625, 1588, 625, 1614, 625, 442, 625, 442, 625, 468, 625, 442, 625, 494, 572, 1614, 625, 1588, 625, 1614, 625, 494, 572, 442, 651, 442, 625, 442, 625, 442, 625, 1614, 625, 1588, 651, 1588, 625, 442, 625, 494, 598, 442, 625, 442, 625, 520, 572, 442,
                625, 442, 625, 442, 651, 1588, 625, 1614, 625, 1588, 625, 1614, 625, 1588, 625, 48958)
        val vb = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if(vb.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                vb.vibrate(VibrationEffect.createOneShot(100, 70))
            }
            else {
                vb.vibrate(70);
            }
        }
        if (!IR.hasIrEmitter()) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ARB Infrared")
        builder.setMessage("No Infrared found on this device..!!")
        builder.setNeutralButton("OK") { dialog, which -> null }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
        else {
            IR.transmit(freq, pattern1)

        }


    }


}
