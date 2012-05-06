package es.vieites.jscoreoid.http;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

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

    public Petition(String requestUrl, String apiKey) throws MalformedURLException,
            UnsupportedEncodingException {
        this.requestUrl = new URL(requestUrl);
        this.parameters = new HashMap<String, String>();
        addParameter("api_key", apiKey);
    }

    /**
     * Adds a parameter name and value to the petition, both will be encoded using {@link URLEncoder}.
     * 
     * @param name parameter name
     * @param value parameter value
     * @throws UnsupportedEncodingException if the encoding fails
     */
    public void addParameter(String name, String value) throws UnsupportedEncodingException {
        if (StringUtils.isNotEmpty(name)) {
            value = StringUtils.defaultString(value);
            this.parameters
                    .put(URLEncoder.encode(name, "UTF-8"), URLEncoder.encode(value, "UTF-8"));
        } else {
            throw new IllegalArgumentException("The name cannot be empty.");
        }
    }

    /**
     * Gets the request URL without the parameter string.
     * @return the request URL
     */
    public URL getRequestUrl() {
        return requestUrl;
    }

    /**
     * Gets the value of the specified parameter.
     * 
     * @param parameterName parameter name
     * @return the parameter value
     */
    public String getValue(String parameterName) {
        return this.parameters.get(parameterName);
    }

    /**
     * Gets the iterator over the parameter names.
     * 
     * @return parameter name iterator
     */
    public Iterator<String> getParameters() {
        return parameters.keySet().iterator();
    }
}
