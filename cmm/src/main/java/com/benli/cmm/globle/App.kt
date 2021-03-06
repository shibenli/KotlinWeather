package com.benli.cmm.globle

import android.app.Application
import android.support.multidex.MultiDexApplication
import android.util.DisplayMetrics

/**
 * Created by shibenli on 2017/7/31.
 */
open class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        app = this
        displayMetrics = resources.displayMetrics
    }

    companion object: CompanionObj()
}

open class CompanionObj{
    open lateinit var app : App
    open lateinit var displayMetrics: DisplayMetrics
}