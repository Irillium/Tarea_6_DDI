package com.example.tarea_6_ddi_rpim.alarm.presentation.adapter

import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea_6_ddi_rpim.R
import com.example.tarea_6_ddi_rpim.alarm.domain.Alarm
import com.example.tarea_6_ddi_rpim.databinding.AlarmItemBinding
import java.text.SimpleDateFormat
import java.util.Locale

class AlarmViewHolder (private val view:View):RecyclerView.ViewHolder(view){
    private val binding: AlarmItemBinding = AlarmItemBinding.bind(view)
    fun bind(alarm: Alarm) {
        binding.apply {
            val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
            hour.text = dateFormat.format(alarm.hour).toString()
            text.text = alarm.description?.takeIf { it.isNotBlank() }?.let {
                "${alarm.frecuency} | $it"
            } ?: alarm.frecuency

            swich.isChecked = alarm.check
            if (!swich.isChecked){
                hour.setTextColor(ContextCompat.getColor(itemView.context, R.color.gray))
                text.setTextColor(ContextCompat.getColor(itemView.context, R.color.gray))
            }
            binding.swich.setOnCheckedChangeListener { _, isChecked ->
                alarm.check = isChecked
                if (!swich.isChecked){
                    hour.setTextColor(ContextCompat.getColor(itemView.context, R.color.gray))
                    text.setTextColor(ContextCompat.getColor(itemView.context, R.color.gray))
                }else{
                    Toast.makeText(itemView.context, "Alarma activada", Toast.LENGTH_SHORT).show()
                    val typedArray = itemView.context.obtainStyledAttributes(
                        null, intArrayOf(android.R.attr.textColorPrimary)
                    )
                    val colorOnPrimary = typedArray.getColor(0, 0)
                    typedArray.recycle()

                    hour.setTextColor(colorOnPrimary)
                    text.setTextColor(colorOnPrimary)
                }
            }
        }
    }
}