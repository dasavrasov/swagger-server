package goodbuy;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbuyController {

    private static final String template = "Bood buy, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Goodbuy greeting(@RequestParam(value="name", defaultValue="user") String name) {
        return new Goodbuy(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
