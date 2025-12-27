package org.wikipedia.homeworks.homework22

import io.github.kakaocup.kakao.common.actions.BaseActions

fun BaseActions.hasIdAction(expectedId: Int): Boolean {
    val checker = HasIdAction(expectedId)
    view.perform(checker)
    return checker.getResult()
}