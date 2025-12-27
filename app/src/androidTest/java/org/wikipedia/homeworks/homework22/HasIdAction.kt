package org.wikipedia.homeworks.homework22

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

class HasIdAction(private val expectedId: Int) : ViewAction {
    private var result = false
    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(View::class.java)
    }

    override fun getDescription(): String {
        return "Проверка, что view содержит элемент с id"
    }

    override fun perform(uiController: UiController?, view: View?) {
        requireNotNull(view) { "view must not be null" }
        val viewId = view.id
        if (viewId == expectedId) {
            result = true
        } else {
            val foundView = view.findViewById<View>(expectedId)
            if (foundView != null) {
                result = true
            }
        }
    }
    fun getResult() = result
}