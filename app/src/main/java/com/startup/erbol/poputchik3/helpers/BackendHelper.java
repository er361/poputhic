package com.startup.erbol.poputchik3.helpers;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.startup.erbol.poputchik3.MainActivity;

public class BackendHelper {
    private static final String TAG = BackendHelper.class.getSimpleName();
    public BackendHelper() {
    }

    protected void sendRequestToBackend() {

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(null);
        String url = "http://10.0.3.2:3000/markers";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        Log.d(TAG, "vse zaebis");
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "vse ploho" + error.getMessage());
            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}