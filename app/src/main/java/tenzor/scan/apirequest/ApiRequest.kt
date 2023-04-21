package tenzor.scan.apirequest

import android.util.Log
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

class PostRequest(){
    val JSON = CONST_JSON.toMediaType()
    val client = OkHttpClient()

    fun createJson(terminalID:String,terminalDataType:String,terminalData:Int,terminalDateTime:String): String {
        return "{\"devID\": \"$terminalID\"," +
               " \"devDataType\": \"$terminalDataType\"," +
               " \"devData\": \"$terminalData\","+
               " \"devDataTime\": \"$terminalDateTime\"}"
    }
    fun postJson(host:String,port:Int,json: String){

            val requestBody = json.toRequestBody(JSON)

            val request = Request.Builder()
                .url("http://$host:$port/")
                .post(requestBody)
                .build()

            client.newCall(request).enqueue(object: Callback {
                override fun onFailure(call: Call, e:IOException ) {
                    Log.e("API", "Request failed: ${e.message}")
                }
                override fun onResponse(call: Call, response: Response) {
                    response.body?.string()?.let { Log.e("API", it) }
                    //TODO: Response spremeni v string ali json
                }
            })
    }
}









