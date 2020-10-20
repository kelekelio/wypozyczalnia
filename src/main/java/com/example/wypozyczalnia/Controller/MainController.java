package com.example.wypozyczalnia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }



    //test pages
    @RequestMapping(value = "/index-2", method = RequestMethod.GET)
    public String index2b() {
        return "index-2";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
        return "index2";
    }

    @RequestMapping(value = "/app-profile", method = RequestMethod.GET)
    public String appProfile() {
        return "test/app-profile";
    }

    @RequestMapping(value = "/email-compose", method = RequestMethod.GET)
    public String emailCompose() {
        return "test/email-compose";
    }

    @RequestMapping(value = "/email-inbox", method = RequestMethod.GET)
    public String emailInbox() {
        return "test/email-inbox";
    }

    @RequestMapping(value = "/email-read", method = RequestMethod.GET)
    public String emailRead() {
        return "test/email-read";
    }

    @RequestMapping(value = "/app-calender", method = RequestMethod.GET)
    public String appCalender() {
        return "test/app-calender";
    }

}
