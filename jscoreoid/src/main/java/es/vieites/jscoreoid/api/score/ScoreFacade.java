package es.vieites.jscoreoid.api.score;

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
import es.vieites.jscoreoid.model.Player;
import es.vieites.jscoreoid.model.Score;

/**
 * Implementation of the interface required to ask the scoreoid Score API.
 * 
 * @author Alejandro Martínez Vieites
 */
public class ScoreFacade extends AbstractFacade implements Scoreinterface {

    /**
     * Constructor for asking the Scores part of the API.
     * 
     * @param url the URL of the scoreoid API (https://www.scoreoid.com/api/)
     * @param apiKey the API key scoreoid gave to you
     */
    public ScoreFacade(String url, String apiKey) {
        super(url, apiKey);
    }

    public Boolean createScore(String gameId, String username, Long score, String platform,
            String uniqueId, String difficulty) throws RequestException {
        Petition request = null;
        String rawResponse = null;
        String value = null;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "createScore", this.apiKey);
            value = gameId;
            request.addParameter("game_id", value);
            value = username;
            request.addParameter("username", value);
            request.addParameter("score", String.valueOf(score));
            value = "json";
            request.addParameter("response", value);
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "createScore", e);
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
        JsonNode rootNode;
        JsonNode childNode = null;

        try {
            rootNode = mapper.readTree(rawResponse);

            childNode = rootNode.findValue("success");
            if (childNode != null) {
                return true;
            } else {
                childNode = rootNode.findValue("error");
                if (childNode != null) {
                    throw new RequestException(rootNode.findValue("error").toString());
                }
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }

        return false;
    }

    public Long countScores(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException {
        Petition request = null;
        String rawResponse = null;
        Long response = -1l;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "countScores", this.apiKey);
            request.addParameter("game_id", gameId);
            request.addParameter("start_date", startDate);
            request.addParameter("end_date", endDate);
            request.addParameter("platform", platform);
            request.addParameter("difficulty", difficulty);
            request.addParameter("response", "json");
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "countScores", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value", e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        JsonNode childNode = null;

        try {
            rootNode = mapper.readTree(rawResponse);

            childNode = rootNode.findValue("scores");
            if (childNode != null) {
                response = childNode.asLong();
            } else {
                childNode = rootNode.findValue("error");
                if (childNode != null) {
                    throw new RequestException(rootNode.findValue("error").toString());
                }
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }

        return response;
    }

    public Long countBestScores(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException {

        Petition request = null;
        String rawResponse = null;
        Long response = -1l;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "countBestScores", this.apiKey);
            request.addParameter("game_id", gameId);
            request.addParameter("start_date", startDate);
            request.addParameter("end_date", endDate);
            request.addParameter("platform", platform);
            request.addParameter("difficulty", difficulty);
            request.addParameter("response", "json");
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "countScores", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value", e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        JsonNode childNode = null;

        try {
            rootNode = mapper.readTree(rawResponse);

            childNode = rootNode.findValue("best_scores");
            if (childNode != null) {
                response = childNode.asLong();
            } else {
                childNode = rootNode.findValue("error");
                if (childNode != null) {
                    throw new RequestException(rootNode.findValue("error").toString());
                }
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }

        return response;
    }

    public List<Score> getScores(String gameId, String orderBy, String order, String limit,
            String startDate, String endDate, String platform, String difficulty)
            throws RequestException {
        Petition request = null;
        String rawResponse = null;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "getScores", this.apiKey);
            request.addParameter("game_id", gameId);
            request.addParameter("order_by", orderBy);
            request.addParameter("order", order);
            request.addParameter("limit", limit);
            request.addParameter("start_date", startDate);
            request.addParameter("end_date", endDate);
            request.addParameter("platform", platform);
            request.addParameter("difficulty", difficulty);
            request.addParameter("response", "json");
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "getScores", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value", e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        JsonNode childNode = null;
        List<Score> scores = new ArrayList<Score>();
        List<Player> players = new ArrayList<Player>();
        List<JsonNode> nodes = null;

        try {
            rootNode = mapper.readTree(rawResponse);

            childNode = rootNode.findValue("error");
            if (childNode != null) {
                if (childNode != null) {
                    throw new RequestException(rootNode.findValue("error").toString());
                }
            } else {
                nodes = rootNode.findValues("Player");
                for (JsonNode node : nodes) {
                    players.add(mapper.readValue(node, Player.class));
                }
                nodes = rootNode.findValues("Score");
                for (int i = 0; i < nodes.size(); i++) {
                    JsonNode node = nodes.get(i);
                    Score score = mapper.readValue(node, Score.class);
                    score.setPlayer(players.get(i));
                    scores.add(score);
                }
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }
        return scores;
    }

    public List<Score> getBestScores(String gameId, String orderBy, String order, String limit,
            String startDate, String endDate, String platform, String difficulty)
            throws RequestException {
        Petition request = null;
        String rawResponse = null;

        // Build the request.
        try {
            request = new Petition(this.requestUrl + "getBestScores", this.apiKey);
            request.addParameter("game_id", gameId);
            request.addParameter("order_by", orderBy);
            request.addParameter("order", order);
            request.addParameter("limit", limit);
            request.addParameter("start_date", startDate);
            request.addParameter("end_date", endDate);
            request.addParameter("platform", platform);
            request.addParameter("difficulty", difficulty);
            request.addParameter("response", "json");
        } catch (MalformedURLException e) {
            throw new RequestException("Bad URL: " + this.requestUrl + "getBestScores", e);
        } catch (UnsupportedEncodingException e) {
            throw new RequestException("Bad enconding for parameter value", e);
        }

        // Send the request and get the JSON response.
        try {
            rawResponse = this.client.doPost(request);
        } catch (IOException e) {
            throw new RequestException("Something went wrong sending the request", e);
        }

        // Map the JSON response to the model object.
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode;
        JsonNode childNode = null;
        List<Score> scores = new ArrayList<Score>();
        List<Player> players = new ArrayList<Player>();
        List<JsonNode> nodes = null;

        try {
            rootNode = mapper.readTree(rawResponse);

            childNode = rootNode.findValue("error");
            if (childNode != null) {
                if (childNode != null) {
                    throw new RequestException(rootNode.findValue("error").toString());
                }
            } else {
                nodes = rootNode.findValues("Player");
                for (JsonNode node : nodes) {
                    players.add(mapper.readValue(node, Player.class));
                }
                nodes = rootNode.findValues("Score");
                for (int i = 0; i < nodes.size(); i++) {
                    JsonNode node = nodes.get(i);
                    Score score = mapper.readValue(node, Score.class);
                    score.setPlayer(players.get(i));
                    scores.add(score);
                }
            }
        } catch (JsonProcessingException e) {
            throw new RequestException("JSON error", e);
        } catch (IOException e) {
            throw new RequestException("IO error", e);
        }
        return scores;
    }

    public Double getAverageScore(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException {
        throw new NotImplementedException("Not implemented yet.");
    }

}
