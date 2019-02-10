package com.joom.yetanotherapp.api

abstract class HttpException(val code: Int) : Exception()

class BadRequestException : HttpException(400)

class UnathorizedException : HttpException(401)
