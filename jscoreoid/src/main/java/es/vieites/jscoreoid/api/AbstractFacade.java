package es.vieites.jscoreoid.api;

import es.vieites.jscoreoid.http.HttpClient;

/**
 * Abstract class to be extended by the API facades. This class holds the API key, request URL and
 * HTTP client logic.
 * 
 * @author Alejandro Martínez Vieites
 */
public abstract class AbstractFacade {

    protected String apiKey = null;

    protected String requestUrl = "https://www.scoreoid.com/api/";

    protected HttpClient client = null;

    /**
     * Constructor for asking the Game part of the API.
     * 
     * @param url the URL of the scoreoid API (https://www.scoreoid.com/api/)
     * @param apiKey the API key scoreoid gave to you
     */
    public AbstractFacade(String url, String apiKey) {
        this.apiKey = apiKey;
        this.requestUrl = url;
        this.client = new HttpClient();
    }
}
