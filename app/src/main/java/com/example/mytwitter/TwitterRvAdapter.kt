package com.example.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var tweetList: List<Twitter>): RecyclerView.Adapter<tweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.tweet_item_list,parent,false)
        return tweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: tweetsViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvHandle .text= currentTweet.handle
        holder.tvName.text = currentTweet.name
        holder.tvTweet .text= currentTweet.tweet
        holder.tvComms.text = currentTweet.comms
        holder.tvRets.text = currentTweet.rets
        holder.tvLiks.text = currentTweet.liks

    }

    override fun getItemCount(): Int {
        return tweetList.size

    }

}

class tweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvComms = itemView.findViewById<TextView>(R.id.tvComms)
    var tvRets = itemView.findViewById<TextView>(R.id.tvRets)
    var tvLiks = itemView.findViewById<TextView>(R.id.tvLiks)
    var imgAvatar = itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgComment = itemView.findViewById<TextView>(R.id.imgComment)
    var imgLoop = itemView.findViewById<TextView>(R.id.imgLoop)
    var imgLike = itemView.findViewById<TextView>(R.id.imgLike)
}

