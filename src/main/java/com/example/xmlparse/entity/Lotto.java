package com.example.xmlparse.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "lotto")
public class Lotto {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Game")
    private List<Game> games;

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}

class Game {

    @JacksonXmlProperty(isAttribute = true, localName = "ItemId")
    private String itemId;

    @JacksonXmlProperty(localName = "FromAegis")
    private FromAegis fromAegis;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public FromAegis getFromAegis() {
        return fromAegis;
    }

    public void setFromAegis(FromAegis fromAegis) {
        this.fromAegis = fromAegis;
    }
}

class FromAegis {

    @JacksonXmlProperty(localName = "DrawNo")
    private int drawNo;

    @JacksonXmlProperty(localName = "Date")
    private String date;

    @JacksonXmlElementWrapper(localName = "WinNumberList")
    @JacksonXmlProperty(localName = "win")
    private List<Win> winNumbers;

    public int getDrawNo() {
        return drawNo;
    }

    public void setDrawNo(int drawNo) {
        this.drawNo = drawNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Win> getWinNumbers() {
        return winNumbers;
    }

    public void setWinNumbers(List<Win> winNumbers) {
        this.winNumbers = winNumbers;
    }
}

class Win {

    @JacksonXmlProperty(isAttribute = true, localName = "type")
    private int type;

    @JacksonXmlProperty(isAttribute = true, localName = "number")
    private String number;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
