package pl.knab.l3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AdderController {

    private final Adder adder;
    private final AdderLogEntryRepository logRepository;

    @Autowired
    public AdderController(Adder adder,
                           AdderLogEntryRepository logRepository) {
        this.adder = adder;
        this.logRepository = logRepository;
    }

    @PostMapping("/add")
    public int addTwoIntegers(@PathParam("a") int a, @PathParam("b") int b) throws ZeroAddedException {
        return adder.add(a, b);
    }

    @GetMapping("/add/logs")
    public List<AdderLogEntry> getLogs() {
        return logRepository.findAll();
    }
}
