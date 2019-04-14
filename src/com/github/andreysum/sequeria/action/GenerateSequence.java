package com.github.andreysum.sequeria.action;

import com.intellij.codeInsight.actions.MultiCaretCodeInsightAction;
import com.intellij.codeInsight.actions.MultiCaretCodeInsightActionHandler;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorModificationUtil;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;

import org.jetbrains.annotations.NotNull;

/**
 * Created by andreysum @ 14.04.19
 */
public class GenerateSequence extends MultiCaretCodeInsightAction {
    @NotNull
    @Override
    protected MultiCaretCodeInsightActionHandler getHandler() {
        return new MultiCaretCodeInsightActionHandler() {
            @Override
            public void invoke(@NotNull Project project, @NotNull Editor editor, @NotNull Caret caret, @NotNull PsiFile file) {
                final PsiDocumentManager documentManager = PsiDocumentManager.getInstance(project);
                Document document = editor.getDocument();
                documentManager.commitDocument(document);
                EditorModificationUtil.insertStringAtCaret(editor, "Generated!");
            }
        };
    }
}
