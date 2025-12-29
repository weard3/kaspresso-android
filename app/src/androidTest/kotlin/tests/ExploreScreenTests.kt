package tests

import android.view.View
import com.atiurin.ultron.custom.espresso.assertion.hasCurrentTextColor
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isCompletelyDisplayed
import com.atiurin.ultron.testlifecycle.activity.UltronActivityRule
import org.hamcrest.Matcher
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.main.MainActivity
import screens.ExploreScreen
import screens.OnboardingScreen

class ExploreScreenTests : BaseTest() {
    init {
        val activityRule = UltronActivityRule(MainActivity::class.java)
        ruleSequence.add(activityRule)
    }

    @Test
    fun exampleTest() = test {
        go {
            OnboardingScreen.skipBtn.click()
            ExploreScreen.topReadBlock.title {
                isCompletelyDisplayed()
                hasCurrentTextColor(R.color.gray700)
            }
        }
    }

    // Добавил, чтобы был такой же dsl как в каспрессо
    operator fun Matcher<View>.invoke(action: Matcher<View>.() -> Unit) {
        this.action()
    }
}