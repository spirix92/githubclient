package com.selen.githubclient.ui.fragment.userslist

import com.selen.githubclient.model.GithubUsersRepo
import com.selen.githubclient.ui.fragment.userslist.adapter.UsersListPresenter
import com.selen.githubclient.ui.navigator.Screens
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router

/**
 * @author Pyaterko Aleksey
 */
class UsersPresenter(val usersRepo: GithubUsersRepo, val router: Router) : MvpPresenter<UsersView>() {

    val usersListPresenter = UsersListPresenter()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
        loadData()

        usersListPresenter.itemClickListener = { itemView ->
            router.navigateTo(Screens.UserDetailScreen(usersListPresenter.users[itemView.pos]))
        }
    }

    fun loadData() {
        val users = usersRepo.getUsers()
        usersListPresenter.users.addAll(users)
        viewState.updateList()
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }

}