package com.ruhlanusubov.mapsactivity.Activities.Domain;

import java.util.ArrayList;

public class cryptowallet {
    private String cryptoName;
    private String cryptosymbol;
    private Double cryptoPrice;
    private Double changePercent;
    private ArrayList<Integer> lineData;
    private Double propertyAmount;
    private Double propertySize;

    public cryptowallet(String cryptoName, String cryptosymbol, Double cryptoPrice, Double changePercent, ArrayList<Integer> lineData, Double propertyAmount, Double propertySize) {
        this.cryptoName = cryptoName;
        this.cryptosymbol = cryptosymbol;
        this.cryptoPrice = cryptoPrice;
        this.changePercent = changePercent;
        this.lineData = lineData;
        this.propertyAmount = propertyAmount;
        this.propertySize = propertySize;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptosymbol() {
        return cryptosymbol;
    }

    public void setCryptosymbol(String cryptosymbol) {
        this.cryptosymbol = cryptosymbol;
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public Double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;
    }

    public ArrayList<Integer> getLineData() {
        return lineData;
    }

    public void setLineData(ArrayList<Integer> lineData) {
        this.lineData = lineData;
    }

    public Double getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(Double propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public Double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Double propertySize) {
        this.propertySize = propertySize;
    }
}
