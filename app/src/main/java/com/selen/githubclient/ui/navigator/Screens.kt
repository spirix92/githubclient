package com.selen.githubclient.ui.navigator

import com.selen.githubclient.model.GithubUser
import com.selen.githubclient.ui.fragment.userdetail.UserDetailFragment
import com.selen.githubclient.ui.fragment.userslist.UsersFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

/**
 * @author Pyaterko Aleksey
 */
class Screens {
    class UsersScreen() : SupportAppScreen() {
        override fun getFragment() = UsersFragment.newInstance()
    }

    class UserDetailScreen(val user: GithubUser) : SupportAppScreen() {
        override fun getFragment() = UserDetailFragment.newInstance(user)
    }
}
