package pl.knab.l3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Adder {

    private final AdderRecorder recorder;

    @Autowired
    public Adder(AdderRecorder recorder) {
        this.recorder = recorder;
    }

    public int add(int a, int b) throws ZeroAddedException {
        if (a == 0 || b == 0) {
            throw new ZeroAddedException();
        }
        recorder.record(a, b);
        return a + b;
    }

}
