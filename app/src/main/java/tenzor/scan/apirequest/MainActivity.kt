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

            val apiTest = PostRequest()
            val myJson = apiTest.createJson("ST1",ApiData.CONST_DATA_TYPE_MIFARE, 546351, "2021-05-12 12:00:00")
            apiTest.postJson("192.168.100.117",8080, myJson)
        }
    }
}