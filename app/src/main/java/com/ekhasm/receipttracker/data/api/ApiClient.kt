package com.ekhasm.receipttracker.data.api
import com.ekhasm.receipttracker.data.model.User

interface ApiClient {
    suspend fun getUsers(): List<User>
}