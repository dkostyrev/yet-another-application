package com.joom.yetanotherapp.di

import android.content.Context
import com.joom.yetanotherapp.RxSchedulers
import com.joom.yetanotherapp.api.YetAnotherApiStub

class InjectorImpl(override val applicationContext: Context) : Injector {
  override val api by lazy {
    YetAnotherApiStub(schedulers.computation)
  }

  override val schedulers by lazy {
    RxSchedulers()
  }
}
