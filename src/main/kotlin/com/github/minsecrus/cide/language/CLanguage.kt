package com.github.minsecrus.cide.language

import com.intellij.lang.Language


object CLanguage : Language("C") {
    private fun readResolve(): Any = CLanguage
}