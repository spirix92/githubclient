package com.selen.githubclient.ui.fragment.userdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.selen.githubclient.R
import com.selen.githubclient.app.App
import com.selen.githubclient.model.GithubUser
import com.selen.githubclient.ui.BackButtonListener
import kotlinx.android.synthetic.main.fragment_user_detail.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


/**
 * @author Pyaterko Aleksey
 */
class UserDetailFragment : MvpAppCompatFragment(), UserDetailView, BackButtonListener {
    companion object {
        lateinit var currentUser: GithubUser
        fun newInstance(user: GithubUser): UserDetailFragment {
            currentUser = user
            return UserDetailFragment()
        }
    }

    val presenter: UserDetailPresenter by moxyPresenter {
        UserDetailPresenter(App.instance.router)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        View.inflate(context, R.layout.fragment_user_detail, null)

    override fun init() {
        user_detail_text.text = currentUser.login
    }

    override fun backPressed() = presenter.backPressed()

}
