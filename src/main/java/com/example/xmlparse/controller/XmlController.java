package com.example.xmlparse.controller;

import com.example.xmlparse.entity.Lotto;
import com.example.xmlparse.service.XmlParsingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {

    private final XmlParsingService xmlParsingService;

    public XmlController(XmlParsingService xmlParsingService) {
        this.xmlParsingService = xmlParsingService;
    }

    @GetMapping("/parse-xml")
    public Lotto parseXml(@RequestParam String fileName) {
        return xmlParsingService.parseXml(fileName);
    }
}