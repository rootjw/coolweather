package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Asus on 2018/1/14.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int countryId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
