package com.propertyfilterer.propertyfilterer.controller;

import com.propertyfilterer.propertyfilterer.model.Host;
import com.propertyfilterer.propertyfilterer.repository.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HostController {

    @Autowired
    private HostRepository hostRepository;

    @GetMapping("/hosts")
    public List<Host> getAllHosts() {
        return hostRepository.findAll();}


}
