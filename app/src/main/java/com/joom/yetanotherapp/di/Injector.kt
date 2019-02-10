package com.joom.yetanotherapp.di

import android.content.Context
import com.joom.yetanotherapp.SchedulersFactory
import com.joom.yetanotherapp.api.YetAnotherApi

interface Injector {
  val applicationContext: Context
  val api: YetAnotherApi
  val schedulers: SchedulersFactory
}
