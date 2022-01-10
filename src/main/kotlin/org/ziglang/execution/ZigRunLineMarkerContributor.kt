package org.ziglang.execution

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import org.ziglang.parsing.v1.psi.ZigFnDeclaration

class ZigRunLineMarkerContributor : RunLineMarkerContributor() {
    override fun getInfo(element: PsiElement): Info? {
        if (element !is ZigFnDeclaration) return null // not a function
        if (element.fnProto.name != "main") return null // not a "main" function

        val actions = ExecutorAction.getActions(Integer.MAX_VALUE);

        return Info(AllIcons.RunConfigurations.TestState.Run, actions) { e ->
            actions.toList().map { action -> getText(action, e) }.joinToString(separator = "\n")
        }
    }
}