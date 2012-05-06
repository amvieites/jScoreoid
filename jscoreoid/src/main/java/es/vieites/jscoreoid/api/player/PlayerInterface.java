package es.vieites.jscoreoid.api.player;

/**
 * Interface for the Player API operations.
 * 
 * @author Alejandro Martínez Vieites
 */
public interface PlayerInterface {
    Boolean createPlayer();
    void editPlayer();
    void deletePlayer();
    void getPlayer();
    void getPlayerField();
    void updatePlayerField();
    void getPlayerScores();
    void countPlayers();
}
