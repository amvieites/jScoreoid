package es.vieites.jscoreoid.model;

import java.io.Serializable;

/**
 * This class holds the information about one score and the player who got it.
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
 * @author Alejandro Martínez Vieites
 */
public class Score implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = -1184123065003449867L;

    private Player player = null;
    private Long score = null;
    private String created = null;
    private Long difficulty = null;
    private String platform = null;

    public final Player getPlayer() {
        return player;
    }

    public final void setPlayer(Player player) {
        this.player = player;
    }

    public final Long getScore() {
        return score;
    }

    public final void setScore(Long score) {
        this.score = score;
    }

    public final String getCreated() {
        return created;
    }

    public final void setCreated(String created) {
        this.created = created;
    }

    public final Long getDifficulty() {
        return difficulty;
    }

    public final void setDifficulty(Long difficulty) {
        this.difficulty = difficulty;
    }

    public final String getPlatform() {
        return platform;
    }

    public final void setPlatform(String platform) {
        this.platform = platform;
    }

    public static final long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return player.getUsername() + " - " + score;
    }
}
