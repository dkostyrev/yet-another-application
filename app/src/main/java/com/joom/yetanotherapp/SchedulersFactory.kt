package com.joom.yetanotherapp

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

interface SchedulersFactory {
  val io: Scheduler
  val newThread: Scheduler
  val computation: Scheduler
  val trampoline: Scheduler
  val mainThread: Scheduler
}

class RxSchedulers : SchedulersFactory {
  override val io: Scheduler
    get() = Schedulers.io()
  override val newThread: Scheduler
    get() = Schedulers.newThread()
  override val computation: Scheduler
    get() = Schedulers.computation()
  override val trampoline: Scheduler
    get() = Schedulers.trampoline()
  override val mainThread: Scheduler
    get() = AndroidSchedulers.mainThread()
}
