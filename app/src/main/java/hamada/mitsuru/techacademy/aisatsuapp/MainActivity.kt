package hamada.mitsuru.techacademy.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                //挨拶
                if(1 < hour && hour < 10){
                    textView.text = "おはよう"
                }
                else if(10 <= hour && hour < 18){
                    textView.text = "こんにちは"
                }
                else if(18 <= hour && hour < 24 || hour == 0 || hour == 1 ){
                    textView.text = "こんばんは"
                }
            },
            13,
            0,
            true
        )
        timePickerDialog.show()
    }
}
