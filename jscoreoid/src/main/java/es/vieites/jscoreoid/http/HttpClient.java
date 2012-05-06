package es.vieites.jscoreoid.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLConnection;
import java.util.Iterator;


/**
 * Sends the request and returns the raw JSON  response.
 * 
 * @author Alejandro Martínez Vieites
 */
public class HttpClient {
    
    /**
     * Sends the request and returns the raw JSON  response.
     * 
     * @param petition the request
     * @return the JSON response
     * @throws IOException problem!
     */
    public String doPost(Petition petition) throws IOException {
        StringBuilder requestData = new StringBuilder("");
        StringBuilder response = new StringBuilder("");

        // Construct data
        for (Iterator<String> it = petition.getParameters(); it.hasNext();) {
            String name = it.next();
            String value = petition.getValue(name);
            
            requestData.append("&").append(name).append("=").append(value);
        }
        requestData.deleteCharAt(0);    // Delete the first '&'.

        // Send data
        URLConnection conn = petition.getRequestUrl().openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(requestData.toString());
        wr.flush();

        // Get the response
        BufferedReader rd = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
        }
        wr.close();
        rd.close();

        return response.toString();
    }
}
