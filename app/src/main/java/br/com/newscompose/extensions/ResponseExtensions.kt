package br.com.newscompose.extensions

import retrofit2.Response

/**
 * @author RubioAlves
 * Created 17/07/2022 at 18:03
 */

sealed class ResponseResult<out Response> {
    class Success<Response>(val response: Response) : ResponseResult<Response>()
    class Error<Response>(val message: String) : ResponseResult<Response>()
}

fun <R : Any> Response<R>.toResponse(): ResponseResult<R> {
    if (isSuccessful) {
        val body = body()
        return if (body != null) {
            ResponseResult.Success(body)
        } else {
            ResponseResult.Error("Erro: ${code()}")
        }
    }
    return ResponseResult.Error("Sem internet")
}