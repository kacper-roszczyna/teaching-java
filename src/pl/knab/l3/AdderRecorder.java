package pl.knab.l3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdderRecorder {

    private final AdderLogEntryRepository repository;

    @Autowired
    public AdderRecorder(AdderLogEntryRepository repository) {
        this.repository = repository;
    }

    public void record(int a, int b) {
        AdderLogEntry entry = new AdderLogEntry();
        entry.setArg1(a);
        entry.setArg2(b);
        repository.save(entry);
    }

}
