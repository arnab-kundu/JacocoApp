package com.arnab.jacocoapp

import org.junit.Assert.assertEquals
import org.junit.Test

class DateFormatterAndroidTest {

    @Test
    fun getFormattedDate() {
        assertEquals("Saturday - 05:29", DateFormatter.getFormattedDate(1645833555045))
        println(DateFormatter.getFormattedDate(System.currentTimeMillis()))
        println(System.currentTimeMillis())                                     //1645833555045
    }

}