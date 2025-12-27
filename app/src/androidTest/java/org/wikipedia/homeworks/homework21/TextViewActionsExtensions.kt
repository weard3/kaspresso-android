package org.wikipedia.homeworks.homework21

import io.github.kakaocup.kakao.text.TextViewActions

fun TextViewActions.getText(): String {
    val getText = GetText()
    view.perform(getText)
    return getText.text
}