package com.a2001.lewlet.explorerobots

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        distance.text = "0ly"
        spin.text = "0˚"
        temperature.text = "243K"
        energy.text = "500W"
        robotPlan1.text = "温度調節"
        robotPlan2.text = "軌道修正"
        robotPlan3.text = "電力増幅"
        robotPlan4.text = "ロボ修理"
    }
}
