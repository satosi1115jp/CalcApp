package jp.techacademy.satoshi.tanaka.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        times.setOnClickListener(this)
        divided.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       try{
            if (v.id == R.id.plus) {
                val VALUE1 = edittexet.text.toString()
                val VALUE2 = edittexet2.text.toString()
                val number1 = VALUE1.toDouble()
                val number2 = VALUE2.toDouble()
                val intent = Intent(this, CalcApp2::class.java)
                val num1 = "${number1 + number2}"
                intent.putExtra("answer1", num1)
                startActivity(intent)
            } else if (v.id == R.id.minus) {
                val VALUE1 = edittexet.text.toString()
                val VALUE2 = edittexet2.text.toString()
                val number1 = VALUE1.toDouble()
                val number2 = VALUE2.toDouble()
                val intent = Intent(this, CalcApp2::class.java)
                val num1 = "${number1 - number2}"
                intent.putExtra("answer1", num1)
                startActivity(intent)
            } else if (v.id == R.id.times) {
                val VALUE1 = edittexet.text.toString()
                val VALUE2 = edittexet2.text.toString()
                val number1 = VALUE1.toDouble()
                val number2 = VALUE2.toDouble()
                val intent = Intent(this, CalcApp2::class.java)
                val num1 = "${number1 * number2}"
                intent.putExtra("answer1", num1)
                startActivity(intent)
            } else {
                val VALUE1 = edittexet.text.toString()
                val VALUE2 = edittexet2.text.toString()
                val number1 = VALUE1.toDouble()
                val number2 = VALUE2.toDouble()
                val intent = Intent(this, CalcApp2::class.java)
                val num1 = "${number1 / number2}"
                intent.putExtra("answer1", num1)
                startActivity(intent)
            }
        } catch (e:Exception) {
            Snackbar.make(v,"数字を入力してください。",Snackbar.LENGTH_LONG).show()
        }
    }


}