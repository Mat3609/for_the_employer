package model;

import java.util.Objects;

public class Paste {
    private final String content;
    private final String expiration;
    private final String name;
    private final String syntaxHighlighting;

    public Paste(String pasteContent, String pasteExpiration, String pasteName, String syntaxHighlighting) {
        this.content = pasteContent;
        this.expiration = pasteExpiration;
        this.name = pasteName;
        this.syntaxHighlighting = syntaxHighlighting;
    }

    public String getContent() {
        return content;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getName() {
        return name;
    }

    public String getSyntaxHighlighting() {
        return syntaxHighlighting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paste paste = (Paste) o;
        return Objects.equals(content, paste.content) && Objects.equals(expiration, paste.expiration) && Objects.equals(name, paste.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, expiration, name);
    }
}
