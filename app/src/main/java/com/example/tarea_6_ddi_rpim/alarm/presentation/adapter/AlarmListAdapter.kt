package com.example.tarea_6_ddi_rpim.alarm.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.tarea_6_ddi_rpim.R
import com.example.tarea_6_ddi_rpim.alarm.domain.Alarm

class AlarmListAdapter () : ListAdapter<Alarm, AlarmViewHolder>(AlarmDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.alarm_item, parent, false)
        return AlarmViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}