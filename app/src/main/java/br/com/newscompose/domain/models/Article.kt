package br.com.newscompose.domain.models

/**
 * @author RubioAlves
 * Created 03/05/2022 at 22:22
 */

data class Article(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)
