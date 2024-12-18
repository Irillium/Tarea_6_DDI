package com.example.tarea_6_ddi_rpim.alarm.domain

import java.util.Date

data class Alarm(val id:String, val hour: Date,var frecuency:String,var description:String? ,var check:Boolean)
