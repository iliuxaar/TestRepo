package com.ar.testlibrary

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

object TestHelper {

    public fun helpToast(context: Context) {
        Toast.makeText(context, "Help", Toast.LENGTH_LONG).show()
    }

    public fun helpImage(context: Context, url: String, imageView: ImageView){
        Glide.with(context)
            .load(url)
            .into(imageView)
    }

}