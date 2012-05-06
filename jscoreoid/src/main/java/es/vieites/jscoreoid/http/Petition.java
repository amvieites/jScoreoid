package es.vieites.jscoreoid.http;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This class represents the data of an HTTP request.
 * 
 * @author Alejandro Martinez Vieites
 */
public class Petition {
    private URL requestUrl = null;
    private Map<String, String> parameters = null;

    public Petition(String requestUrl) throws MalformedURLException {
        this.requestUrl = new URL(requestUrl);
        this.parameters = new HashMap<String, String>();
    }

    public Petition(String requestUrl, String apiKey) throws MalformedURLException, UnsupportedEncodingException {
        this.requestUrl = new URL(requestUrl);
        this.parameters = new HashMap<String, String>();
        addParameter("api_key", apiKey);
    }

    public void addParameter(String name, String value) throws UnsupportedEncodingException {
        this.parameters.put(URLEncoder.encode(name, "UTF-8"), URLEncoder.encode(value, "UTF-8"));
    }

    public URL getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(URL requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getValue(String parameterName) {
        return this.parameters.get(parameterName);
    }

    public Iterator<String> getParameters() {
        return parameters.keySet().iterator();
    }
}
