package es.vieites.jscoreoid.api.player;

import org.apache.commons.lang.NotImplementedException;

import es.vieites.jscoreoid.api.AbstractFacade;

public class PlayerFacade extends AbstractFacade implements PlayerInterface {
    
    /**
     * Constructor for asking the Players part of the API.
     * 
     * @param url the URL of the scoreoid API (https://www.scoreoid.com/api/)
     * @param apiKey the API key scoreoid gave to you
     */
    public PlayerFacade(String url, String apiKey) {
        super(url, apiKey);
    }

    public Boolean createPlayer() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void editPlayer() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void deletePlayer() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void getPlayer() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void getPlayerField() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void updatePlayerField() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void getPlayerScores() {
        throw new NotImplementedException("Not implemented yet.");
    }

    public void countPlayers() {
        throw new NotImplementedException("Not implemented yet.");
    }
}
