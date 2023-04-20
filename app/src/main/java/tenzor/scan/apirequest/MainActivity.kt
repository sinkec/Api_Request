package tenzor.scan.apirequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApiReq = findViewById<Button>(R.id.btnApiReq)

        btnApiReq.setOnClickListener {

            val apiTest = ApiRequest()
            apiTest.helloApi()
        }
    }
}