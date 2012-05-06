package es.vieites.jscoreoid.api.score;

import java.util.List;

import es.vieites.jscoreoid.exceptions.RequestException;
import es.vieites.jscoreoid.model.Player;
import es.vieites.jscoreoid.model.Score;

/**
 * Interface for the Score API operations.
 * 
 * @author Alejandro Martínez Vieites
 */
public interface Scoreinterface {

    /**
     * Creates a new score for the player.
     * 
     * @param gameId the game identifier
     * @param score actual score
     * @param username username of the player who did the score
     * @param platform (optional)
     * @param uniqueId (optional)
     * @param difficulty (optional)
     * @return true, if the score has been created
     */
    Boolean createScore(String gameId, String username, Long score, String platform,
            String uniqueId, String difficulty) throws RequestException;

    /**
     * Returns total number of scores for the game.
     * 
     * @param gameId the game identifier
     * @param startDate (optional)
     * @param endDate (optional)
     * @param platform (optional)
     * @param difficulty (optional)
     * @return the number of scores
     * @throws RequestException if something go wrong
     */
    Long countScores(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException;

    /**
     * Returns total number of best scores for the game.
     * 
     * @param gameId the game identifier
     * @param startDate (optional)
     * @param endDate (optional)
     * @param platform (optional)
     * @param difficulty (optional)
     * @return the number of scores
     * @throws RequestException if something go wrong
     */
    Long countBestScores(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException;

    /**
     * This method is pulling all the scores for a game.
     * <p>
     * The {@link Player} instance does not contain all the information of the player but only the
     * following data:
     * <ul>
     * <li>username</li>
     * <li>email</li>
     * <li>first name</li>
     * <li>last name</li>
     * <li>platform</li>
     * </ul>
     * The rest of the {@link Player}s data will not be filled.
     * </p>
     * 
     * @param gameId the game identifier
     * @param orderBy field to order by (optional)
     * @param order asc or desc (optional)
     * @param limit 20 retrieves rows 1 - 20 | "10,20" retrieves 20 scores starting from the 10th
     * @param startDate (optional)
     * @param endDate (optional)
     * @param platform (optional)
     * @param difficulty (optional)
     * @return the list of scores
     * @throws RequestException if something go wrong
     */
    List<Score> getScores(String gameId, String orderBy, String order, String limit,
            String startDate, String endDate, String platform, String difficulty)
            throws RequestException;

    /**
     * This method is pulling all the best scores for a game.
     * 
     * <p>
     * The {@link Player} instance does not contain all the information of the player but only the
     * following data:
     * <ul>
     * <li>username</li>
     * <li>email</li>
     * <li>first name</li>
     * <li>last name</li>
     * <li>platform</li>
     * </ul>
     * The rest of the {@link Player}s data will not be filled.
     * </p>
     * 
     * @param gameId the game identifier
     * @param orderBy field to order by (optional)
     * @param order asc or desc (optional)
     * @param limit 20 retrieves rows 1 - 20 | "10,20" retrieves 20 scores starting from the 10th
     * @param startDate (optional)
     * @param endDate (optional)
     * @param platform (optional)
     * @param difficulty (optional)
     * @return the list of scores
     * @throws RequestException if something go wrong
     */
    List<Score> getBestScores(String gameId, String orderBy, String order, String limit,
            String startDate, String endDate, String platform, String difficulty)
            throws RequestException;

    /**
     * Returns the average score for the game.
     * 
     * @param gameId the game identifier
     * @param startDate (optional)
     * @param endDate (optional)
     * @param platform (optional)
     * @param difficulty (optional)
     * @return the averga score
     * @throws RequestException if something go wrong
     */
    Double getAverageScore(String gameId, String startDate, String endDate, String platform,
            String difficulty) throws RequestException;
}
