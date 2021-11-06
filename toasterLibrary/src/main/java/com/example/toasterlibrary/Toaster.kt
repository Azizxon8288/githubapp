package com.example.toasterlibrary

import android.content.Context
import android.location.Location
import android.widget.Toast

fun toaster(context: Context, str: Any) {
    Toast.makeText(context, "$str", Toast.LENGTH_SHORT).show()
}

fun getDistance(startLat: Double, startLng: Double, endLat: Double, endLng: Double): Float {
    val result = FloatArray(1)
    Location.distanceBetween(startLat, startLng, endLat, endLng, result)
    return result[0] / 1000
}