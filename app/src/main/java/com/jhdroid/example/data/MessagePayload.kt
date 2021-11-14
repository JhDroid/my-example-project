package com.jhdroid.example.data

class MessagePayload(
    var id: String?,
    var roomId: String?,
    var timestamp: String?,
    var writer: Writer?,
    var writerEnc: String?,
    var cmd: String?,
    var data: Data?,
) {
    data class Data(
        val viewType: String?,
        val messageList: List<String>
    )
}