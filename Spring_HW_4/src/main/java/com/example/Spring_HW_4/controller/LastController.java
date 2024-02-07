package com.example.Spring_HW_4.controller;

import com.example.Spring_HW_4.model.PersonalData;
import com.example.Spring_HW_4.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


@Controller
public class LastController {
    @Autowired
    private PersonalDataService dataService;

    @GetMapping("/data")
    public String viewDataOfPeoples(Model model){
        List<PersonalData> personalDataList = dataService.getLst();
        model.addAttribute("data", personalDataList);
        return "data";
    }
    @PostMapping("/data")
    public String addData(PersonalData personalData, Model model){
        dataService.addPersonalData(personalData);
        List<PersonalData> personalDataList = dataService.getLst();
        model.addAttribute("data", personalDataList);
        return "data";
    }
}
