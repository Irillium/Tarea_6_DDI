package com.example.tarea_6_ddi_rpim.alarm.presentation

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarea_6_ddi_rpim.R
import com.example.tarea_6_ddi_rpim.alarm.data.AlarmDataMock
import com.example.tarea_6_ddi_rpim.alarm.domain.Alarm
import com.example.tarea_6_ddi_rpim.alarm.presentation.adapter.AlarmListAdapter
import com.example.tarea_6_ddi_rpim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding:ActivityMainBinding?=null
    private val binding get() = _binding!!

    private  var alarmAdapter:AlarmListAdapter=AlarmListAdapter()

    private val isDarkMode: Boolean
        get() = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data= AlarmDataMock()
        setubView(data.getAlarms())
    }

    fun setubView(alarms:List<Alarm>){
        alarmAdapter.submitList(alarms)
        binding.apply {
            listItem.layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,
                false
            )
            listItem.adapter = alarmAdapter
        }

    }

}