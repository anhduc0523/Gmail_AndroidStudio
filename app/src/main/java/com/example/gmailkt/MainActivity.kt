package com.example.gmailkt


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListAdapter
import android.widget.ListView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: ListAdapter
    private lateinit var gmail: Gmail
    var dataArrayList = ArrayList<Gmail?>()

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        var listImage = intArrayOf(
            android.R.drawable.btn_star_big_on,
            android.R.drawable.stat_sys_vp_phone_call_on_hold,
            android.R.drawable.presence_away,
            android.R.drawable.presence_audio_online,
            android.R.drawable.presence_video_online,
            android.R.drawable.star_on,
            R.drawable.meo1,
            R.drawable.dog,
            R.drawable.baseline_check_24,
        )
        var title = arrayOf(
            "Hello Anh Duc",
            "Welcome to our sales",
            "How are you today?",
            "Thank you for contacting ABC Company",
            "Thank you for your prompt reply ",
            "Thank you for getting back to me ",
            "Thank you for banking",
            "Email guidelines",
            "Subcribe me!",
        )

        var summary = arrayOf(
            "Hello.......",
            "Welcome to our biggest sales in this year..........",
            "How are you today ...",
            "Thank you for contacting us ...",
            "We are DEF Company. Thank you ...",
            "It's it a pleasure ...",
            "I have received your money ...",
            "Hi Anh Duc! ...",
            "Welcome to Optimus channel ...",
        )

        var content = arrayOf(
            "Hello Anh Duc",
            "Welcome to our biggest sales in this year, this year we have the biggest sales about shoes,.....",
            "How are you today, I haven't seen you for a long time. I miss u so much",
            "Thank you for contacting us. This email is automating",
            "We are DEF Company. Thank you for contacting our company to apply to IT Job",
            "It's it a pleasure to welcome you to the team.",
            "I have received your money form BIDV",
            "Hi Anh Duc!Y You hace 10 news to see now",
            "Welcome to Optimus channel, you can subcribe to have a notification when streamer start livestreaming",
        )

        for(i in listImage.indices){
            gmail = Gmail(
                title[i],summary[i],content[i], listImage[i]
            )
            dataArrayList.add(gmail)
        }

        listAdapter = GmailAdapter(this@MainActivity,dataArrayList)
        var listview = findViewById<ListView>(R.id.listgmail)
        listview.adapter = listAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}