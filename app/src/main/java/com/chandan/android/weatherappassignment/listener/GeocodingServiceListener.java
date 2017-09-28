
package com.chandan.android.weatherappassignment.listener;

import com.chandan.android.weatherappassignment.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
