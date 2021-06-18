package br.com.shido.realmtest.android


import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

fun injectMainFeature() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(
        listOf(
            mainViewModel
        )
    )
}

val mainViewModel = module {
    viewModel { MainViewModel() }
}