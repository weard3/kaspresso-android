package screens

import android.view.View
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

object ExploreScreen : KScreen<ExploreScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val feed by lazy {
        KRecyclerView(
            builder = { this.withId(R.id.feed_view) },
            itemTypeBuilder = {
                itemType(::FeedTopReadItem)
            }
        )
    }

    val topReadBlock
        get() = feed.childWith<FeedTopReadItem> {
            withDescendant {
                withId(R.id.view_card_header_title)
                withText("Top read")
            }
        }

    class FeedTopReadItem(matcher: Matcher<View>) : KRecyclerItem<FeedTopReadItem>(matcher) {
        val title by lazy {
            KTextView(matcher) { withId(R.id.view_card_header_title) }
        }
    }
}