package service;

import model.Paste;

public class PasteCreator {
    public static final String TESTDATA_CONTENT = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    public static final String TESTDATA_EXPIRATION = "10 MIN";
    public static final String TESTDATA_NAME = "how to gain dominance among developers";
    public static final String TESTDATA_SYNTAX_HIGHLIGHTING = "Bash";

    public static Paste createPaste() {
        return new Paste(TESTDATA_CONTENT, TESTDATA_EXPIRATION, TESTDATA_NAME, TESTDATA_SYNTAX_HIGHLIGHTING);
    }
}
