package br.com.newscompose.data.api

import br.com.newscompose.data.models.NewsResponse
import br.com.newscompose.domain.utils.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author RubioAlves
 * Created 15/05/2022 at 15:07
 */
interface NewsApi {
    @GET("top-headlines?country=br")
    suspend fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}