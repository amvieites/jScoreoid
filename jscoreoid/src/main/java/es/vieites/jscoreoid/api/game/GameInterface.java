package es.vieites.jscoreoid.api.game;

import java.util.List;

import es.vieites.jscoreoid.exceptions.RequestException;
import es.vieites.jscoreoid.model.Game;
import es.vieites.jscoreoid.model.GameFields;
import es.vieites.jscoreoid.model.Notification;
import es.vieites.jscoreoid.model.Player;

/**
 * Interface for the Game API operations.
 * 
 * @author Alejandro Martínez Vieites
 */
public interface GameInterface {

    /**
     * Get all the information about the specified {@link Game}.
     * 
     * @param gameId the scoreoid ID of the game
     * @return the {@link Game} object or <code>null</code> there is not that game
     */
    Game getGame(String gameId) throws RequestException;

    /**
     * Get just the value of the field specified.
     * 
     * @param gameId the scoreoid ID of the game
     * @param field the name of the field
     * @return the field value
     */
    String getGameField(String gameId, GameFields field) throws RequestException;

    List<Player> getPlayers(String gameId) throws RequestException;

    String getGameAverage(String gameId, GameFields field) throws RequestException;

    String getGameTop(String gameId, GameFields field) throws RequestException;

    String getGameLowest(String gameId, GameFields field) throws RequestException;

    String getGameTotal(String gameId, GameFields field) throws RequestException;

    List<Notification> getNotification(String gameId) throws RequestException;
}
