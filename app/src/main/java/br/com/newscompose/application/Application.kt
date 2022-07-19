package br.com.newscompose.application

import android.app.Application
import br.com.newscompose.di.NewsComposeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author RubioAlves
 * Created 15/05/2022 at 15:23
 */
class Application:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)
            modules(NewsComposeModule.load())
        }
    }
}