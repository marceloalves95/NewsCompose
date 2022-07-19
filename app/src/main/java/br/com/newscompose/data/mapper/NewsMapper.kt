package br.com.newscompose.data.mapper

import br.com.newscompose.data.models.ArticleResponse
import br.com.newscompose.data.models.SourceResponse
import br.com.newscompose.data.models.NewsResponse
import br.com.newscompose.domain.models.Article
import br.com.newscompose.domain.models.Source
import br.com.newscompose.domain.models.News

/**
 * @author RubioAlves
 * Created 17/07/2022 at 16:23
 */

fun NewsResponse.toNews() = News(
    status = status,
    totalResultado = totalResultado,
    articles = artigos.toArticle()
)
fun List<ArticleResponse>.toArticle() = this.map {
    Article(
        author = it.autor,
        content = it.conteudo,
        description = it.descricao,
        publishedAt = it.publicadoEm,
        source = it.fonte?.toSource(),
        title = it.titulo,
        url = it.url,
        urlToImage = it.urlToImage
    )
}

fun SourceResponse.toSource() = Source(
    id = id,
    nome = nome
)