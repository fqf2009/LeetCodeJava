package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2296_DesignTextEditorTest {
    @Test
    void textEditor() {
        LC2296_DesignTextEditor textEditor = new LC2296_DesignTextEditor();
        textEditor.addText("leetcode");
        assertEquals(4, textEditor.deleteText(4));
        textEditor.addText("practice");
        assertEquals("etpractice", textEditor.cursorRight(3));
        assertEquals("leet", textEditor.cursorLeft(8));
        assertEquals(4, textEditor.deleteText(10));
        assertEquals("", textEditor.cursorLeft(2));
        assertEquals("practi", textEditor.cursorRight(6));
    }

    @Test
    void textEditor1() {
        LC2296_DesignTextEditor1 textEditor = new LC2296_DesignTextEditor1();
        textEditor.addText("leetcode");
        assertEquals(4, textEditor.deleteText(4));
        textEditor.addText("practice");
        assertEquals("etpractice", textEditor.cursorRight(3));
        assertEquals("leet", textEditor.cursorLeft(8));
        assertEquals(4, textEditor.deleteText(10));
        assertEquals("", textEditor.cursorLeft(2));
        assertEquals("practi", textEditor.cursorRight(6));
    }

    @Test
    void textEditor2() {
        LC2296_DesignTextEditor2 textEditor = new LC2296_DesignTextEditor2();
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