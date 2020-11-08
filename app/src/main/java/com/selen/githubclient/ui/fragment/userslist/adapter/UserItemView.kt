package com.selen.githubclient.ui.fragment.userslist.adapter

import com.selen.githubclient.ui.IItemView

/**
 * @author Pyaterko Aleksey
 */
interface UserItemView: IItemView {
    fun setLogin(text: String)
}