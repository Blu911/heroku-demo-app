package blu911.test.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "<h1>Hello to my demo app deployed on Heroku!</h1>\n" +
                "<h3>This is final test</h3>";
    }
}
