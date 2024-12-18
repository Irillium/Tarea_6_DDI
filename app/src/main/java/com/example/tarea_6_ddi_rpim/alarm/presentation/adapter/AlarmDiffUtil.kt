package com.example.tarea_6_ddi_rpim.alarm.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.tarea_6_ddi_rpim.alarm.domain.Alarm

class AlarmDiffUtil:DiffUtil.ItemCallback<Alarm>() {
    override fun areItemsTheSame(oldItem: Alarm, newItem: Alarm): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: Alarm, newItem: Alarm): Boolean {
        return oldItem==newItem
    }
}