package ru.konder.myapplicationalarm

import android.app.AlarmManager
import android.content.Context
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import androidx.core.view.OneShotPreDrawListener.add
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickTime()
    }
    private fun onClickTime(){
        val textView = findViewById<TextView>(R.id.txtTimer)
        val timePicker = findViewById<TimePicker>(R.id.timePick)
        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
            var hourOfDay = hourOfDay
            if (textView != null) {
                val hour = if (hourOfDay < 10) "0$hourOfDay" else hourOfDay
                val min = if (minute < 10) "0$minute" else minute
                val text = "$hour : $min"
                textView.text = text
                textView.visibility = View.VISIBLE
            }
        }
    }
    private fun setAlarm(number: Int){
        val date = SimpleDateFormat("HH:mm:ss")
        val text_timer = StringBuilder()
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val now = Calendar.getInstance()
        val calendarList = ArrayList<Calendar>()
        for(i in 1..number) calendarList.add(now)
        for(calendar in calendarList){
            calendar.add(Calendar.SECOND, 10)
            val requestCode = Random().nextInt()
            
        }

    }
}