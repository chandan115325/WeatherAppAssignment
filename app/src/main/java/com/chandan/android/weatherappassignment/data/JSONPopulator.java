
package com.chandan.android.weatherappassignment.data;

import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}
