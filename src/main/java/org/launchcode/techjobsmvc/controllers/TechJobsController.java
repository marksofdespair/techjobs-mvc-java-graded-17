package org.launchcode.techjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();
    public void actionChoices() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    public static HashMap <String, String> getActionChoices (@ModelAttribute HashMap<String, String> actionChoices){
        return actionChoices;
    }
}