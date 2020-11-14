package com.selen.githubclient.ui.fragment.userslist

import com.selen.githubclient.model.GithubUsersRepo
import com.selen.githubclient.ui.fragment.userslist.adapter.UsersListPresenter
import com.selen.githubclient.ui.navigator.Screens
import io.reactivex.rxjava3.disposables.CompositeDisposable
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router

/**
 * @author Pyaterko Aleksey
 */
class UsersPresenter(val usersRepo: GithubUsersRepo, val router: Router) : MvpPresenter<UsersView>() {

    val usersListPresenter = UsersListPresenter()
    val compositeDisposable = CompositeDisposable()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
        asyncLoadData()

        usersListPresenter.itemClickListener = { itemView ->
            router.navigateTo(Screens.UserDetailScreen(usersListPresenter.users[itemView.pos]))
        }
    }

    fun asyncLoadData() {
        compositeDisposable.add(usersRepo.getObservableUsers().subscribe({ s ->
            usersListPresenter.users.add(s)
            viewState.updateList()
        }, { e ->
            println("onError: ${e.message}")
        }))
    }

    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }
    fun backPressed(): Boolean {
        router.exit()
        return true
    }

}