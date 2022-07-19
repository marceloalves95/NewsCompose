package br.com.newscompose.data

import br.com.newscompose.data.api.NewsApi
import br.com.newscompose.data.models.NewsResponse
import br.com.newscompose.data.mapper.toNews
import br.com.newscompose.domain.repository.NewsRepository
import br.com.newscompose.extensions.ResponseResult
import br.com.newscompose.extensions.toResponse

/**
 * @author RubioAlves
 * Created 17/07/2022 at 16:55
 */
class NewsRepositoryImpl(
    private val newsApi: NewsApi
) : NewsRepository {
    override suspend fun getNews(): ResponseResult<NewsResponse> {

        val response = newsApi.getNews().toResponse()

        when (response) {
            is ResponseResult.Success -> {
                response.response.toNews()
            }
            is ResponseResult.Error -> {
                response.message
            }
        }
        return response
    }}