package com.selen.githubclient.ui.activity.main

import com.selen.githubclient.ui.navigator.Screens
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router

/**
 * @author Pyaterko Aleksey
 */
class MainPresenter(val router: Router) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(Screens.UsersScreen())
    }

    fun backClicked() {
        router.exit()
    }
}
