
package com.chandan.android.weatherappassignment.listener;

import com.chandan.android.weatherappassignment.data.Channel;



public interface WeatherServiceListener {

    void serviceFailure(Exception exception);

    void serviceSuccess(Channel channel);
}
