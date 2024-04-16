package com.yurivital.projectmanager.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.yurivital.projectmanager.Adapter.OngoingAdapter
import com.yurivital.projectmanager.R
import com.yurivital.projectmanager.ViewModel.MainViewModel
import com.yurivital.projectmanager.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            val ongoingAdapter by lazy { OngoingAdapter(mainViewModel.loadData()) }

            viewOngoing.apply {
                adapter=ongoingAdapter
                layoutManager=GridLayoutManager(this@DashboardActivity, 2 )
            }
        }
    }
}