package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2296_DesignTextEditorTest {
    LC2296_DesignTextEditor textEditor;

    @BeforeEach
    void setUp() {
        textEditor = new LC2296_DesignTextEditor();
    }

    @Test
    void textEditor1() {
        textEditor.addText("leetcode");
        assertEquals(4, textEditor.deleteText(4));
        textEditor.addText("practice");
        assertEquals("etpractice", textEditor.cursorRight(3));
        assertEquals("leet", textEditor.cursorLeft(8));
        assertEquals(4, textEditor.deleteText(10));
        assertEquals("", textEditor.cursorLeft(2));
        assertEquals("practi", textEditor.cursorRight(6));
    }
}