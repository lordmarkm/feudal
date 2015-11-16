package com.feudal.core.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Mark Martinez, created Nov 16, 2015
 */
@Embeddable
public class Location {

    @Column(name = "lat", nullable = false)
    private Double latitude;

    @Column(name = "lon", nullable = false)
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
