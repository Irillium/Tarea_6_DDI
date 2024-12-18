package com.example.tarea_6_ddi_rpim.alarm.data

import com.example.tarea_6_ddi_rpim.alarm.domain.Alarm
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class AlarmDataMock {
    fun getAlarms(): List<Alarm> {
        return listOf(
            Alarm("1", SimpleDateFormat("HH:mm").parse("01:17"), "Diaria", null, true),
            Alarm("2", SimpleDateFormat("HH:mm").parse("03:45"), "Lunes a viernes", "Toma de medicación", false),
            Alarm("3", SimpleDateFormat("HH:mm").parse("06:59"), "Diaria", "Caminar al trabajo", true),
            Alarm("4", SimpleDateFormat("HH:mm").parse("08:03"), "Mensual", null, true),
            Alarm("5", SimpleDateFormat("HH:mm").parse("11:23"), "Sábados", "Ir al mercado", false),
            Alarm("6", SimpleDateFormat("HH:mm").parse("13:33"), "Diaria", "Comida", true),
            Alarm("7", SimpleDateFormat("HH:mm").parse("16:18"), "Diaria", null, false),
            Alarm("8", SimpleDateFormat("HH:mm").parse("19:11"), "Una sola vez", "Cine con amigos", true),
            Alarm("9", SimpleDateFormat("HH:mm").parse("21:57"), "Lunes y miércoles", null, true),
            Alarm("10", SimpleDateFormat("HH:mm").parse("23:59"), "Diaria", "Revisar correo", false)
        )
    }
}