package tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.main.MainActivity
import screens.ExploreScreen
import screens.OnboardingScreen

class TestExample : TestCase() {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    // Пример теста. Пропускаем онбординг, получаем Top read блок из ресайклера фида,
    // делаем какие-то ассерты на заголовке блока.
    @Test
    fun continueBtnCheck() {
        run {
            OnboardingScreen.skipBtn.click()
            ExploreScreen.topReadBlock.title {
                isCompletelyDisplayed()
                hasTextSize(24)
                hasTextColor(R.color.gray700)
            }
        }
    }
}