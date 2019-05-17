package com.newweather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int Id;
    private String weatherId;
    private String countyName;
    private int cityId;
    public int getId(){
        return this.Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getWeatherId(){
        return this.weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public String getCountyName(){
        return this.countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public int getCityId(){
        return this.cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
