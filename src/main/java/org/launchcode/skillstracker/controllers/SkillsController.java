package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String addIntro() {
        String html = "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills to learn</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>Python</li>" +
                        "<li>JavaScript</li>" +
                    "</ol>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String chooseLang() {
        return
                "<form method = 'get' action = '/form'>" +
                "<label>Name: </label><input type = 'text' name = 'userName' />" +
                "<br>" +
                "<label>My fav lang</label>" +
                "<br>" +
                "<select name = 'firstChoice' id='firstChoice' />" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'python'>Python</option>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<input type = 'submit' value = 'Submit!' />" +
                "</form>";
    }

    @PostMapping("form")

    public String displayChoices(@RequestParam String userName, @RequestParam String firstChoice) {
        return "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "</ol>";

    }
}
