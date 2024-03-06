package tw.edu.pu.s1111187.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t:TextView = findViewById(R.id.txv)
        t.text = "0"
    }
    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        if (v.id == R.id.btn){
            txv.text = (1..100).random().toString()
        }
        else{
            txv.text = "0"
        }
    }



}