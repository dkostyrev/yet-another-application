package com.joom.yetanotherapp.ui

import android.support.v7.app.AppCompatActivity
import com.joom.yetanotherapp.di.InjectorHolder

abstract class BaseActivity : AppCompatActivity(), InjectorHolder {
  override val injector by lazy {
    requireNotNull(applicationContext as? InjectorHolder) {
      "Application should implement ${InjectorHolder::class.java} interface"
    }.injector
  }
}
