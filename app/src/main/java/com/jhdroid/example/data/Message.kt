package com.jhdroid.example.data

data class Message(
    var id: String?,
    var messageViewType: String?,
    var roomId: String?,
    var timestamp: String?,
    var cmd: String?,
    var messageTime: String?,
    var date: String?,
    var messageList: List<String>,
    var isFirstMessage: Boolean = false,
    var isVisibleTime: Boolean = false
)