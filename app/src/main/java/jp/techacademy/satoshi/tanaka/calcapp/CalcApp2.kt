package jp.techacademy.satoshi.tanaka.calcapp

import android.app.PictureInPictureParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_app2.*
import kotlinx.android.synthetic.main.activity_main.*

class CalcApp2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app2)
        val value1 = intent.getStringExtra("answer1")
        answer.text=value1

    }


}