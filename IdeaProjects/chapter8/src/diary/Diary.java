package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Entry> entries = new ArrayList<>();
    private boolean hasEmptyEntry;

    public boolean hasEmptyEntry() {
        return hasEmptyEntry = true;
    }
    public void addAnEntry(Entry entry) {
        entries.add(entry);
    }
}
