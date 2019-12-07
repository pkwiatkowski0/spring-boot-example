package start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private String a = "";

    @RequestMapping("/")
    public String index() {
        return "Greetings from springboot!";
    }
}
