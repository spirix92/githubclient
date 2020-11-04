package com.selen.githubclient.presenter

import com.selen.githubclient.model.ButtonNumber
import com.selen.githubclient.model.Model
import com.selen.githubclient.view.MainView

/**
 * @author Pyaterko Aleksey
 */
class Presenter(val view: MainView) {

    private val model = Model()

    fun buttonOneClick() {
        view.setButtonOneText(model.next(ButtonNumber.ONE).toString())
    }

    fun buttonTwoClick() {
        view.setButtonTwoText(model.next(ButtonNumber.TWO).toString())
    }

    fun buttonThreeClick() {
        view.setButtonThreeText(model.next(ButtonNumber.THREE).toString())
    }

}