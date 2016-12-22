package data;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by ryan on 12/22/16.
 */

public class CityPreferences {
    SharedPreferences prefs;

    public CityPreferences(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity(){
        return prefs.getString("city", "Guelph,can");
    }

    public void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
