package diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Entry {
    private final String id;
    private final String tittle;
    private final String body;
    private LocalDateTime dateTime = LocalDateTime.now();
    public Entry(String tittle, String body){
        this(UUID.randomUUID().toString(), tittle, body);
    }
    public Entry(String id, String tittle, String body){
        if (tittle.length() == 0) {
            throw new IllegalArgumentException("sorry tittle can not be empty");
    }
        if (body.length() == 0) {
            throw new IllegalArgumentException("sorry body can not be empty");
        }
        this.tittle = tittle;
        this.body = body;
        this.id = id;
    }
    public String getTittle() {
        return tittle;
    }
    public String getId() {
        return id;
    }
    public String getBody() {
        return body;
    }
}
