package com.newweather.android.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int Id;
    private int provinceId;
    private String cityName;
    private int cityCode;
    public int getId(){
        return this.Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
//    这个应该怎么记录上一级的id呢？
//    通过参数传递进来不就行了？。。。能得到city肯定已经得到了province实例
//    所以在province类中定义一个方法来得到code的值
//    是怎么进行初始化的呢？
//    在处理网页信息的时候进行的初始化，一个一个的初始化
    public int getProvinceId(){
        return this.provinceId;
    }
    public void setProvinceId(int provinceCode){
        this.provinceId = provinceCode;
    }
    public String getCityName(){
        return this.cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return this.cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
}
