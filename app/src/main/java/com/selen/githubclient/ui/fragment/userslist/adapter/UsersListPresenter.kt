package com.selen.githubclient.ui.fragment.userslist.adapter

import com.selen.githubclient.model.GithubUser

/**
 * @author Pyaterko Aleksey
 */
class UsersListPresenter : IUserListPresenter {
    val users = mutableListOf<GithubUser>()
    override var itemClickListener: ((UserItemView) -> Unit)? = null

    override fun getCount() = users.size

    override fun bindView(view: UserItemView) {
        val user = users[view.pos]
        view.setLogin(user.login)
    }
}