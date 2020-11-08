package com.selen.githubclient.ui.fragment.userdetail

import moxy.MvpPresenter
import ru.terrakok.cicerone.Router


/**
 * @author Pyaterko Aleksey
 */
class UserDetailPresenter (val router: Router) : MvpPresenter<UserDetailView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }

}