package org.wikipedia.homeworks.homework22

import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView

inline fun <reified T: KRecyclerItem<*>> KRecyclerView.invokeById(
    index: Int,
    expectedId: Int,
    function: T.() -> Unit
) {
    val recycler = this
    for (i in 0 until recycler.getSize()) {
        childAt<T>(i).
    }
}