package br.com.newscompose.domain.repository

import br.com.newscompose.data.models.NewsResponse
import br.com.newscompose.extensions.ResponseResult

/**
 * @author RubioAlves
 * Created 17/07/2022 at 16:54
 */

interface NewsRepository {
    suspend fun getNews():ResponseResult<NewsResponse>
}