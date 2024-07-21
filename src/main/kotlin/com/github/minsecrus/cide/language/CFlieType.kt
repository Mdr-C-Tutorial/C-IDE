package com.github.minsecrus.cide.language

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

open class CFileType protected constructor() : LanguageFileType(CLanguage) {
    override fun getName(): @NonNls String {
        return "C File"
    }

    override fun getDescription(): @NlsContexts.Label String {
        return "File of C Programming Language"
    }

    override fun getDefaultExtension(): String {
        return "c"
    }

    override fun getIcon(): Icon {
        return CIcons.FILE
    }

    companion object {
        val INSTANCE: CFileType = CFileType()
    }
}
