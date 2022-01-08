package org.ziglang.editing

import com.intellij.psi.PsiElement
import org.ziglang.parsing.v1.ZigFile
import org.ziglang.parsing.v1.psi.*

fun PsiElement.presentText(): String = when (this) {
    is ZigFile -> name
    is ZigIfBlock,
    is ZigIfExprOrBlock -> "if ${children.getOrNull(1)?.text ?: ""}"
    is ZigFnDeclaration -> "fn ${fnProto.name}()"
    is ZigExternDeclaration -> "extern ${variableDeclaration?.name}"
    is ZigGlobalVarDeclaration -> "global ${variableDeclaration.name}"
    is ZigUseDeclaration -> "use ${expr.text}"
    else -> text
}

val PsiElement.treeViewTokens
    get() = this is ZigFile ||
            this is ZigFnDeclaration ||
            this is ZigExternDeclaration ||
            this is ZigGlobalVarDeclaration ||
            this is ZigUseDeclaration ||
            this is ZigIfExprOrBlock ||
            this is ZigIfErrorBlock ||
            this is ZigIfExprOrBlock ||
            this is ZigTestBlock ||
            this is ZigTestExprOrBlock

const val TEXT_MAX = 16

fun cutText(it: String, textMax: Int) = if (it.length <= textMax) it else "${it.take(textMax)}…"