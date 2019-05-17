package com.newweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int Id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return this.Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getProvinceName(){
        return this.provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return this.provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
