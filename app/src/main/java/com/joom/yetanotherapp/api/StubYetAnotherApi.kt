package com.joom.yetanotherapp.api

import android.util.Patterns
import com.joom.yetanotherapp.domain.User
import io.reactivex.Scheduler
import io.reactivex.Single
import java.util.concurrent.TimeUnit

class YetAnotherApiStub(private val scheduler: Scheduler) : YetAnotherApi {
  override fun login(email: String, password: String): Single<User> {
    return Single.timer(3L, TimeUnit.SECONDS, scheduler)
      .flatMap {
        when {
          !matchesEmail(email) -> Single.error(BadRequestException())
          !matchesPassword(password) -> Single.error(UnathorizedException())
          else -> {
            Single.just(User("Stub User"))
          }
        }
      }
  }

  private fun matchesEmail(email: String): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
  }

  private fun matchesPassword(password: String): Boolean {
    return password.trim().length > 5
  }
}
