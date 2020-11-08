package com.selen.githubclient.ui.activity.main

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

/**
 * @author Pyaterko Aleksey
 */
@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView