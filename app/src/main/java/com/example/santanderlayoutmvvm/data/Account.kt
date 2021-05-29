package com.example.santanderlayoutmvvm.data

data class Account(
        val number: String,
        val agency: String,
        val balance: String,
        val creditLimit : String,
        val client: Client,
        val card : Card
)
