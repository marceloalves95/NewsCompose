package br.com.newscompose.di

import br.com.newscompose.data.api.NewsApi
import br.com.newscompose.domain.utils.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author RubioAlves
 * Created 01/05/2022 at 13:28
 */
object NewsComposeModule {

    fun load() {
        loadKoinModules(
            listOf(
                dataModule()
            )
        )
    }

    private fun dataModule(): Module {
        return module {
            getNetworking()
        }
    }
//
//    private fun domainModule(): Module {
//        return module {
//            single {
//
//            }
//            single {
//
//            }
//        }
//    }
//

    private fun getNetworking(): NewsApi {

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient: OkHttpClient =
            OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }
//
//    private fun presentationModule(): Module {
//        return module {
//            viewModel {
//
//            }
//        }
//    }
}