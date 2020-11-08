package com.selen.githubclient.ui.fragment.userdetail

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

/**
 * @author Pyaterko Aleksey
 */
@StateStrategyType(AddToEndSingleStrategy::class)
interface UserDetailView : MvpView {
    fun init()
}