package com.jhdroid.example.data

import org.json.JSONArray

sealed class MessageData(type: String) {
    data class MessageText(
        val body: String
    ): MessageData("text")

    data class MessageButton(
        val title: String,
        val action: JSONArray
    ) : MessageData("content")

    data class MessageImage(
        val title: String,
        val url: String
    ) : MessageData("image")

    data class MessageStack(
        val stackType: String,
        val items: MessageData,
        val messageData: MessageData
    ) : MessageData("stack")
}