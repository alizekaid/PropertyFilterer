package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.PropInfo;
import com.propertyfilterer.propertyfilterer.repository.PropInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PropInfoController {

    @Autowired
    private PropInfoRepository propInfoRepository;


    @GetMapping("/all")
    public List<PropInfo> getAllPropInfos() {
        return propInfoRepository.findAll();
    }


}
