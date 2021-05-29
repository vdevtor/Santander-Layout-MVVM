package com.example.santanderlayoutmvvm.data.local

import com.example.santanderlayoutmvvm.data.Account
import com.example.santanderlayoutmvvm.data.Card
import com.example.santanderlayoutmvvm.data.Client

class FakeData {

    fun getLocalData(): Account {

        val client = Client("Vitor Soares")
        val card = Card("4111111111")
        return Account("445566-4",
                "6525-4",
                "R$ 7.500,38",
                "R$ 10.000,00",
                client, card)
    }
}