package com.example.xmlparse.service;

import com.example.xmlparse.entity.Lotto;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class XmlParsingService {

    public Lotto parseXml(String fileName) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            InputStream inputStream = new ClassPathResource(fileName).getInputStream();
            return xmlMapper.readValue(inputStream, Lotto.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
