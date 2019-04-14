package com.github.andreysum.sequeria.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by andreysum @ 14.04.19
 */
public class GenerateSequence extends AnAction {
    public GenerateSequence() {
        super("Generate _Sequence");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        System.out.println("Generated!");
    }
}
