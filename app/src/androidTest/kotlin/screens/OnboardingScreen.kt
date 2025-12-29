package screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R

object OnboardingScreen : KScreen<OnboardingScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null


    val continueBtn by lazy {
        KButton { withId(R.id.fragment_onboarding_forward_button) }
    }
    val skipBtn by lazy {
        KButton { withId(R.id.fragment_onboarding_skip_button) }
    }
}