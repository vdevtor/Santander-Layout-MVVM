package com.example.santanderlayoutmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.example.santanderlayoutmvvm.R
import com.example.santanderlayoutmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setObservables()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun setObservables() {
        viewModel.getClientAccount().observe(this, { result ->
            binding.apply {
                tvUser.text = result.client.name
                tvAgNumerber.text = result.agency
                tvCcNumber.text = result.number
                tvBalanceValue.text = result.balance
                creditLimitValue.text = result.creditLimit
            }
        })
    }
}