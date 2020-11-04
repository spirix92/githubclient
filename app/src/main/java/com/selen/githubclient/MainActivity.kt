package com.selen.githubclient

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.selen.githubclient.presenter.Presenter
import com.selen.githubclient.view.MainView


class MainActivity : AppCompatActivity(), MainView {

    private lateinit var presenter: Presenter
    private lateinit var buttonCounter1: Button
    private lateinit var buttonCounter2: Button
    private lateinit var buttonCounter3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)

        buttonCounter1 = findViewById(R.id.activity_main_button_one)
        buttonCounter1.setOnClickListener { presenter.buttonOneClick() }
        buttonCounter2 = findViewById(R.id.activity_main_button_two)
        buttonCounter2.setOnClickListener { presenter.buttonTwoClick() }
        buttonCounter3 = findViewById(R.id.activity_main_button_three)
        buttonCounter3.setOnClickListener { presenter.buttonThreeClick() }

    }

    override fun setButtonOneText(text: String) {
        buttonCounter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        buttonCounter2.text = text
    }

    override fun setButtonThreeText(text: String) {
        buttonCounter3.text = text
    }

}