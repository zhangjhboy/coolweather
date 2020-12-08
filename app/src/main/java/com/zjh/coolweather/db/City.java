package com.zjh.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * 城市实体类
 * @author zjh
 * @since 2020/12/8
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;//城市代号
    private int provinceId;//所属省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
