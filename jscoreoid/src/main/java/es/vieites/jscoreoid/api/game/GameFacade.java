package es.vieites.jscoreoid.api.game;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import es.vieites.jscoreoid.api.AbstractFacade;
import es.vieites.jscoreoid.exceptions.RequestException;
import es.vieites.jscoreoid.http.Petition;
import es.vieites.jscoreoid.model.Game;
import es.vieites.jscoreoid.model.GameFields;
import es.vieites.jscoreoid.model.Notification;
import es.vieites.jscoreoid.model.Player;

/**
 * Implementation of the interface required to ask the scoreoid Game API.
 * 
 * @author Alejandro Martínez Vieites
 */
public class GameFacade extends AbstractFacade implements GameInterface {

    /**
     * Constructor for asking the Games part of the API.
     * 
     * @param url the URL of the scoreoid API (https://www.scoreoid.com/api/)
     * @param apiKey the API key scoreoid gave to you
     */
    public GameFacade(String url, String apiKey) {
        super(url, apiKey);
    }

    public Game getGame(String gameId) throws RequestException {
        Petition request = null;
        String rawResponse = null;
        String value = null;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "getGame", this.apiKey);
            value = gameId;
            request.addParameter("game_id", value);
            value = "json";
            request.addParameter("response", value);
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "getGame", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value: " + value, e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;
        JsonNode gameNode = null;
        Game game = null;
        try {
            rootNode = mapper.readTree(rawResponse);
            gameNode = rootNode.findValue("Game");
            if (gameNode != null) {
                game = mapper.readValue(gameNode, Game.class);
            } else {
                throw new RequestException("Request error: "+ rootNode.findValue("error"));
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }

        return game;
    }

    public String getGameField(String gameId, GameFields field) {
        throw new NotImplementedException("Not implemented yet.");
    }

    public List<Player> getPlayers(String gameId) {
        Petition request = null;
        String rawResponse = null;
        String value = null;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "getPlayers", this.apiKey);
            value = gameId;
            request.addParameter("game_id", value);
            value = "json";
            request.addParameter("response", value);
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "getPlayers", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value: " + value, e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;
        List<Player> players = new ArrayList<Player>();
        try {
            rootNode = mapper.readTree(rawResponse);
            if (rootNode != null) {
                List<JsonNode> nodes = rootNode.findValues("Player");
                for (JsonNode node : nodes) {
                    players.add(mapper.readValue(node, Player.class));
                }
                if (nodes == null || nodes.size() == 0) {
                    JsonNode error = rootNode.findValue("error");
                    if (error != null) {
                        throw new RequestException("Request error: "+ rootNode.findValue("error"));
                    }
                }
                
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }
        return players;
    }

    public String getGameAverage(String gameId, GameFields field) {
        throw new NotImplementedException("Not implemented yet.");
    }

    public String getGameTop(String gameId, GameFields field) {
        throw new NotImplementedException("Not implemented yet.");
    }

    public String getGameLowest(String gameId, GameFields field) {
        throw new NotImplementedException("Not implemented yet.");
    }

    public String getGameTotal(String gameId, GameFields field) {
        throw new NotImplementedException("Not implemented yet.");
    }

    public List<Notification> getNotification(String gameId) {
        throw new NotImplementedException("Not implemented yet.");
    }
}
