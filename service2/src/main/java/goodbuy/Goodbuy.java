package goodbuy;

public class Goodbuy {

    private final long id;
    private final String content;

    public Goodbuy(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
