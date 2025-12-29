package screens

import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.ultron.page.Screen
import org.wikipedia.R

object OnboardingScreen : Screen<OnboardingScreen>() {
    val skipBtn by lazy { withId(R.id.fragment_onboarding_skip_button) }
}