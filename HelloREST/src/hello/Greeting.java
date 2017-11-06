package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final char klass;

    public Greeting(long id, String content, char klass) {
        this.id = id;
        this.content = content;
        this.klass = klass;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public char getKlass() {
		return klass;
	}
    
}