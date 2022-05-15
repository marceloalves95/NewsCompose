package br.com.newscompose.domain.models

/**
 * @author RubioAlves
 * Created 03/05/2022 at 22:22
 */
data class Artigo(
    val author: Any,
    val content: Any,
    val description: Any,
    val publishedAt: String,
    val source: Fonte,
    val title: String,
    val url: String,
    val urlToImage: String
)
