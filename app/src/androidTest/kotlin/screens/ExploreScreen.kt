package screens

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.ultron.core.espresso.recyclerview.UltronRecyclerViewItem
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import com.atiurin.ultron.page.Screen
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.wikipedia.R

object ExploreScreen : Screen<ExploreScreen>() {
    val feed by lazy { withRecyclerView(R.id.feed_view) }

    val topReadBlock
        get() = feed.getFirstItemMatched<FeedTopReadItem>(hasDescendant(FeedTopReadItem.blockMatcher))


    class FeedTopReadItem() : UltronRecyclerViewItem() {
        val title by child { withId(R.id.view_card_header_title) }

        companion object {
            val blockMatcher: Matcher<View> = allOf(
                withId(R.id.view_card_header_title),
                withText("Top read")
            )
        }
    }
}