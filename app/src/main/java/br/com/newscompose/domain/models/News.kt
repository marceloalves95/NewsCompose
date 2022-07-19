package br.com.newscompose.domain.models

/**
 * @author RubioAlves
 * Created 17/07/2022 at 16:45
 */
data class News(
    val status: String?,
    val totalResultado: Int?,
    val articles: List<Article>
)
