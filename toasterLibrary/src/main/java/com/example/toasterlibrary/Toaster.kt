package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

fun toaster(context: Context, str: Any) {
    Toast.makeText(context, "$str", Toast.LENGTH_SHORT).show()
}