package jp.techacademy.hisakazu.matsuo.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
//import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
//import java.time.LocalTime


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
  //              Log.d("UI_PARTS", "$hour:$minute")
  //              textView.text="$hour"+"$minute"

               var num = "$hour:$minute"

                if ("02:00"<= num && num < "10:00"){
                    Log.d("UI_PARTS", "おはよう")
                    textView.text="おはよう"
                }
                else if ("10:00"<= num && num < "18:00"){
                    Log.d("UI_PARTS", "こんにちは")
                    textView.text="こんにちは"
                }

                else if ("18:00"<= num && num < "24:00"){
                    Log.d("UI_PARTS", "こんばんは")
                    textView.text="こんばんは"
                }

                else if  ("00:00"<= num && num < "02:00"){
                    Log.d("UI_PARTS", "こんばんは")
                    textView.text="こんばんは"
                }

                else{
                    Log.d("UI_PARTS", "Erro")
                    textView.text="入力ミスです、もう一度お願いします。"
                }

            },
            13, 0, true)

        timePickerDialog.show()

    }
}
