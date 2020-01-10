package com.ar.testlibrary

import android.content.Context
import android.widget.Toast

object TestHelper {

    public fun helpToast(context: Context) {
        Toast.makeText(context, "Help", Toast.LENGTH_LONG).show()
    }

}