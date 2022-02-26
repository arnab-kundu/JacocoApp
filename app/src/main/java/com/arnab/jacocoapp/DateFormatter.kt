package com.arnab.jacocoapp

import java.text.SimpleDateFormat
import java.util.*

object DateFormatter {
    fun getFormattedDate(millisecond: Long?): String {
        if (millisecond != null) {
            val simpleDateFormat = SimpleDateFormat("EEEE", Locale.getDefault())
            val simpleTimeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
            return simpleDateFormat.format(millisecond) + " - " + simpleTimeFormat.format(millisecond)
        } else {
            return "Input millisecond not found"
        }
    }
}