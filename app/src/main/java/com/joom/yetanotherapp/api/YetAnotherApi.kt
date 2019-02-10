package com.joom.yetanotherapp.api

import com.joom.yetanotherapp.domain.User
import io.reactivex.Single

interface YetAnotherApi {

  fun login(email: String, password: String): Single<User>

}
