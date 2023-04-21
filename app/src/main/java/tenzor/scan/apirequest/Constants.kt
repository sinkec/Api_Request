package tenzor.scan.apirequest

const val CONST_JSON = "application/json; charset=utf-8"

class ApiData{
    companion object{
        const val DATA_TYPE_QR = "QR"
        const val DATA_TYPE_BAR = "BAR"
        const val DATA_TYPE_MIFARE = "MIFARE"
        const val DATA_TYPE_NFC = "NFC"
    }
}