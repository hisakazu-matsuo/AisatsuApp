package jp.techacademy.hisakazu.matsuo.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalTime


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.textSize= 30f
        button1.text="時刻ボタン"
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->

               var num = hour

                if (2<= num && num < 10){
                    textView.text="おはよう"
                }
                else if (10<= num && num < 18){
                    textView.text="こんにちは"
                }

                else if (18<= num && num < 24){
                    textView.text="こんばんは"
                }

                else if  (0<= num && num < 2){
                    textView.text="こんばんは"
                }

                else{
                    textView.text="入力ミスです、もう一度お願いします。"
                }

            },
            13, 0, true)

        timePickerDialog.show()

    }
}
