package com.kieronquinn.app.taptap.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

fun Context.launchCCT(url: String){
    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    if (browserIntent.resolveActivity(getPackageManager()) != null) {
        startActivity(browserIntent);
    }
}