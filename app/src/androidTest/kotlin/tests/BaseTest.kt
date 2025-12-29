package tests

import com.atiurin.ultron.core.config.UltronConfig
import com.atiurin.ultron.core.test.UltronTest
import com.atiurin.ultron.testlifecycle.rulesequence.RuleSequence
import org.junit.BeforeClass
import org.junit.Rule

open class BaseTest : UltronTest() {
    @get:Rule
    open val ruleSequence = RuleSequence()

    companion object {
        @BeforeClass
        @JvmStatic
        fun setUp() {
            UltronConfig.applyRecommended()
        }
    }
}