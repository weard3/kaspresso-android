package org.wikipedia.homeworks.homework21

import android.view.View
import android.widget.TextView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import org.junit.Assert

class CustomViewAssertion(private val text: String) : ViewAssertion {
    override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
        if (view is TextView) {
            Assert.assertEquals(text, view.text)
        } else throw (noViewFoundException ?: IllegalArgumentException("View is not TextView"))
    }
}