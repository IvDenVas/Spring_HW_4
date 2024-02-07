package com.example.Spring_HW_4.service;

import com.example.Spring_HW_4.model.PersonalData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class PersonalDataService {
    private List<PersonalData> lst = new ArrayList<>();

    public List<PersonalData> getLst() {
        return lst;
    }
    public void addPersonalData(PersonalData personalData){
        lst.add(personalData);
    }
}
