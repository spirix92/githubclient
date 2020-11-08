package com.selen.githubclient.ui

/**
 * @author Pyaterko Aleksey
 */
interface IListPresenter<V : IItemView> {
    var itemClickListener: ((V) -> Unit)?
    fun bindView(view: V)
    fun getCount(): Int
}