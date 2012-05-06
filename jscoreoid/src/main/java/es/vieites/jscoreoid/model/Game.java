package es.vieites.jscoreoid.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Game implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = -3192125654005688863L;

    private String name = null;
    @JsonProperty("secure_word")
    private String secureWord = null;
    @JsonProperty("secure_status")
    private String secureStatus = null;
    @JsonProperty("user_id")
    private String userId = null;
    @JsonProperty("short_description")
    private String shortDescription = null;
    private String description = null;
    @JsonProperty("game_type")
    private String gameType = null;
    private String version = null;
    private String levels = null;
    private String platform = null;
    @JsonProperty("play_url")
    private String playUrl = null;
    @JsonProperty("website_url")
    private String websiteUrl = null;
    private String created = null;
    private String updated = null;
    @JsonProperty("players_count")
    private Integer playersCount = null;
    @JsonProperty("scores_count")
    private Integer scoresCount = null;
    private String locked = null;
    private String status = null;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecureWord() {
        return secureWord;
    }

    public void setSecureWord(String secureWord) {
        this.secureWord = secureWord;
    }

    public String getSecureStatus() {
        return secureStatus;
    }

    public void setSecureStatus(String secureStatus) {
        this.secureStatus = secureStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getPlayersCount() {
        return playersCount;
    }

    public void setPlayersCount(Integer playersCount) {
        this.playersCount = playersCount;
    }

    public Integer getScoresCount() {
        return scoresCount;
    }

    public void setScoresCount(Integer scoresCount) {
        this.scoresCount = scoresCount;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
