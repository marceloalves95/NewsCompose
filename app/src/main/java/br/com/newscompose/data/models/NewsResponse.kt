package br.com.newscompose.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * @author RubioAlves
 * Created 15/05/2022 at 15:15
 */

@Parcelize
data class NewsResponse(
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResultado: Int?,
    @SerializedName("articles")
    val artigos: List<ArticleResponse>
) : Parcelable

@Parcelize
data class ArticleResponse(
    @SerializedName("source")
    val fonte:SourceResponse?,
    @SerializedName("author")
    val autor: String?,
    @SerializedName("title")
    val titulo: String?,
    @SerializedName("description")
    val descricao: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("urlToImage")
    val urlToImage: String?,
    @SerializedName("publishedAt")
    val publicadoEm: String?,
    @SerializedName("content")
    val conteudo: String?
) : Parcelable

@Parcelize
data class SourceResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("nome")
    val nome: String?
):Parcelable
