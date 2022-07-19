package br.com.newscompose.domain.usecase

import br.com.newscompose.domain.repository.NewsRepository

/**
 * @author RubioAlves
 * Created 17/07/2022 at 18:56
 */
class GetNews(
    private val repository: NewsRepository
){

}