package br.com.newscompose.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.newscompose.domain.usecase.GetNews
import kotlinx.coroutines.launch

/**
 * @author RubioAlves
 * Created 01/05/2022 at 14:42
 */
class HomeActivityViewModel(
    private val getNews: GetNews
):ViewModel() {

}