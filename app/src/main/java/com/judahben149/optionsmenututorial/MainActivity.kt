package com.judahben149.optionsmenututorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import com.judahben149.optionsmenututorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search_icon -> {
                //Put in whatever code you want here, I'll just put in a snackbar
                Snackbar.make(binding.root, "Search item clicked", Snackbar.LENGTH_SHORT).show()
            }
            R.id.history_icon -> {
                Snackbar.make(binding.root, "History item clicked", Snackbar.LENGTH_SHORT).show()
            }
            R.id.settings_icon -> {
                Snackbar.make(binding.root, "Settings item clicked", Snackbar.LENGTH_SHORT).show()
            }
            R.id.save_icon -> {
                Snackbar.make(binding.root, "Save item clicked", Snackbar.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}