package com.xjkwak.wawitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fum = LocalDate.parse("2019-10-23")
        var today = LocalDate.now()
        var betweenWeeks = ChronoUnit.DAYS.between(fum, today).toFloat()
        betweenWeeks /= 7

        text_FUM.text = "FUM: $fum"
        text_today.text = "Hoy: $today"
        text_result_number.text = "%.2f".format(betweenWeeks)
    }
}
