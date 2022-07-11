package com.example.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = Twitter("@Rosesandalotus","Swabrina","Happy holidays","",
            "","4","","2","","5")
        var tweet2 = Twitter("@Yugi","Yugi","Kotlin!!","","","6",
            "","5","","6")
        var tweet3 = Twitter("@Kirigo","Kirigo","Kotlin!!!","","",
        "5","","8","","9")
        var tweet4 = Twitter("@Miriam","Miriam","Kotlin","","",
        "5","","4","","11")
      var tweetList =
            listOf(tweet1,tweet2,tweet3,tweet4,tweet4)
        var tweetAdapter = TwitterRvAdapter(tweetList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = tweetAdapter

    }
}