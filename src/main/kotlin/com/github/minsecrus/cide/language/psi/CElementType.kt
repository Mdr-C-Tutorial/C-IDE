package com.github.minsecrus.cide.language.psi

import com.github.minsecrus.cide.language.CLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class CElementType(@NotNull @NonNls debugName:String): IElementType(debugName,CLanguage) {
}