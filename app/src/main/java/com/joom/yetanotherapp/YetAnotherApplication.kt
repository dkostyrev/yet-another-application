package com.joom.yetanotherapp

import android.app.Application
import com.joom.yetanotherapp.di.InjectorHolder
import com.joom.yetanotherapp.di.InjectorImpl

@Suppress("unused")
class YetAnotherApplication : Application(), InjectorHolder {
  override val injector by lazy { InjectorImpl(this) }
}
