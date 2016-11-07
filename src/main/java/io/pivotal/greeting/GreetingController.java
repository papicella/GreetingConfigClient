package io.pivotal.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @RequestMapping("/")
    String getGreeting(Model model) {

        logger.debug("Adding greeting");
        model.addAttribute("msg", "Greetings!!!");

        //resolves to the greeting.vm velocity template
        return "greeting";
    }

}

