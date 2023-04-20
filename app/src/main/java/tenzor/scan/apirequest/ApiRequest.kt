package tenzor.scan.apirequest

import android.util.Log
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

class ApiRequest(){
    fun helloApi(){

            val payload = "application/json; charset=utf8"
            val okHttpClient = OkHttpClient()
            val requestBody = payload.toRequestBody()

            val request = Request.Builder()
                .method("POST",requestBody)
                .url("http://192.168.100.117:8080/api")
                //.url("https://mysafeinfo.com/api/data?list=autocompanies&format=json&case=default")
                .build()

            okHttpClient.newCall(request).enqueue(object: Callback {
                override fun onFailure(call: Call, e:IOException ) {
                    Log.e("API", "Request failed: ${e.message}")
                }
                override fun onResponse(call: Call, response: Response) {
                    Log.e("API", "${response.body?.string()}")
                    //TODO: Response spremeni v string ali json
                }
            })
    }
}









