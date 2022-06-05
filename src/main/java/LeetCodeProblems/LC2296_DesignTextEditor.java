package LeetCodeProblems;

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */
public class LC2296_DesignTextEditor {
    private final StringBuilder builder;
    private int cursor;

    public LC2296_DesignTextEditor() {
        builder = new StringBuilder();
        cursor = 0;
    }

    public void addText(String text) {
        builder.insert(cursor, text);
        cursor += text.length();
    }

    public int deleteText(int k) {
        int cnt = Integer.min(k, cursor);
        cursor -= cnt;
        builder.delete(cursor, cursor + cnt);
        return cnt;
    }

    private String textOnLeft(int k) {
        int cnt = Integer.min(k, cursor);
        return builder.substring(cursor - cnt, cursor);
    }

    public String cursorLeft(int k) {
        cursor -= Integer.min(k, cursor);
        return textOnLeft(10);
    }

    public String cursorRight(int k) {
        cursor += Integer.min(k, builder.length() - cursor);
        return textOnLeft(10);
    }
}
