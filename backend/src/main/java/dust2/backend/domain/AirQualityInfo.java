package dust2.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirQualityInfo {
    private String dataTime;
    private int pm10Value;
    private int pm10Grade;
    private String stationName;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public int getPm10Value() {
        return pm10Value;
    }

    public void setPm10Value(int pm10Value) {
        this.pm10Value = pm10Value;
    }

    public int getPm10Grade() {
        return pm10Grade;
    }

    public void setPm10Grade(int pm10Grade) {
        this.pm10Grade = pm10Grade;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
