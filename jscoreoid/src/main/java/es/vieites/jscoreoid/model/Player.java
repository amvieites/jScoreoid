package es.vieites.jscoreoid.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Player implements Serializable {

    /** The serial version UID. */
    private static final long serialVersionUID = -6093667694634796350L;
    private Long id = null;
    @JsonProperty("game_id")
    private String gameId = null;
    @JsonProperty("user_id")
    private Long userId = null;
    private String username = null;
    private String password = null;
    @JsonProperty("unique_id")
    private String uniqueId = null;
    @JsonProperty("first_name")
    private String firstName = null;
    @JsonProperty("last_name")
    private String lastName = null;
    private String email = null;
    private String created = null;
    private String updated = null;
    private String bonus = null;
    private String achievements = null;
    @JsonProperty("best_score")
    private Long bestScore = null;
    private Long gold = null;
    private Long money = null;
    private Long kills = null;
    private Long lives = null;
    @JsonProperty("time_played")
    private Long timePlayed = null;
    @JsonProperty("unlocked_levels")
    private Integer unlockedLevels = null;
    @JsonProperty("unlocked_items")
    private String unlockedItems = null;
    private String inventory = null;
    @JsonProperty("last_level")
    private String lastLevel = null;
    @JsonProperty("current_level")
    private String currentLevel = null;
    @JsonProperty("current_time")
    private Long currentTime = null;
    @JsonProperty("current_bonus")
    private Long currentBonus = null;
    @JsonProperty("current_kills")
    private Long currentKills = null;
    @JsonProperty("current_achievements")
    private String currentAchievements = null;
    @JsonProperty("current_gold")
    private Long currentGold = null;
    @JsonProperty("current_unlocked_levels")
    private Long currentUnlockedLevels = null;
    @JsonProperty("current_unlocked_items")
    private String currentUnlockedItems = null;
    @JsonProperty("current_lifes")
    private Long currentLifes = null;
    private String xp = null;
    private String energy = null;
    private String boost = null;
    private String latitude = null;
    private String longitude = null;
    private String game_state = null;
    private String platform = null;

    public final Long getId() {
        return id;
    }

    public final void setId(Long id) {
        this.id = id;
    }

    public final String getGameId() {
        return gameId;
    }

    public final void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public final Long getUserId() {
        return userId;
    }

    public final void setUserId(Long userId) {
        this.userId = userId;
    }

    public final String getUsername() {
        return username;
    }

    public final void setUsername(String username) {
        this.username = username;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public final String getUniqueId() {
        return uniqueId;
    }

    public final void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getCreated() {
        return created;
    }

    public final void setCreated(String created) {
        this.created = created;
    }

    public final String getUpdated() {
        return updated;
    }

    public final void setUpdated(String updated) {
        this.updated = updated;
    }

    public final String getBonus() {
        return bonus;
    }

    public final void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public final String getAchievements() {
        return achievements;
    }

    public final void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public final Long getBestScore() {
        return bestScore;
    }

    public final void setBestScore(Long bestScore) {
        this.bestScore = bestScore;
    }

    public final Long getGold() {
        return gold;
    }

    public final void setGold(Long gold) {
        this.gold = gold;
    }

    public final Long getMoney() {
        return money;
    }

    public final void setMoney(Long money) {
        this.money = money;
    }

    public final Long getKills() {
        return kills;
    }

    public final void setKills(Long kills) {
        this.kills = kills;
    }

    public final Long getLives() {
        return lives;
    }

    public final void setLives(Long lives) {
        this.lives = lives;
    }

    public final Long getTimePlayed() {
        return timePlayed;
    }

    public final void setTimePlayed(Long timePlayed) {
        this.timePlayed = timePlayed;
    }

    public final Integer getUnlockedLevels() {
        return unlockedLevels;
    }

    public final void setUnlockedLevels(Integer unlockedLevels) {
        this.unlockedLevels = unlockedLevels;
    }

    public final String getUnlockedItems() {
        return unlockedItems;
    }

    public final void setUnlockedItems(String unlockedItems) {
        this.unlockedItems = unlockedItems;
    }

    public final String getInventory() {
        return inventory;
    }

    public final void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public final String getLastLevel() {
        return lastLevel;
    }

    public final void setLastLevel(String lastLevel) {
        this.lastLevel = lastLevel;
    }

    public final String getCurrentLevel() {
        return currentLevel;
    }

    public final void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public final Long getCurrentTime() {
        return currentTime;
    }

    public final void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public final Long getCurrentBonus() {
        return currentBonus;
    }

    public final void setCurrentBonus(Long currentBonus) {
        this.currentBonus = currentBonus;
    }

    public final Long getCurrentKills() {
        return currentKills;
    }

    public final void setCurrentKills(Long currentKills) {
        this.currentKills = currentKills;
    }

    public final String getCurrentAchievements() {
        return currentAchievements;
    }

    public final void setCurrentAchievements(String currentAchievements) {
        this.currentAchievements = currentAchievements;
    }

    public final Long getCurrentGold() {
        return currentGold;
    }

    public final void setCurrentGold(Long currentGold) {
        this.currentGold = currentGold;
    }

    public final Long getCurrentUnlockedLevels() {
        return currentUnlockedLevels;
    }

    public final void setCurrentUnlockedLevels(Long currentUnlockedLevels) {
        this.currentUnlockedLevels = currentUnlockedLevels;
    }

    public final String getCurrentUnlockedItems() {
        return currentUnlockedItems;
    }

    public final void setCurrentUnlockedItems(String currentUnlockedItems) {
        this.currentUnlockedItems = currentUnlockedItems;
    }

    public final Long getCurrentLifes() {
        return currentLifes;
    }

    public final void setCurrentLifes(Long currentLifes) {
        this.currentLifes = currentLifes;
    }

    public final String getXp() {
        return xp;
    }

    public final void setXp(String xp) {
        this.xp = xp;
    }

    public final String getEnergy() {
        return energy;
    }

    public final void setEnergy(String energy) {
        this.energy = energy;
    }

    public final String getBoost() {
        return boost;
    }

    public final void setBoost(String boost) {
        this.boost = boost;
    }

    public final String getLatitude() {
        return latitude;
    }

    public final void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public final String getLongitude() {
        return longitude;
    }

    public final void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public final String getGame_state() {
        return game_state;
    }

    public final void setGame_state(String game_state) {
        this.game_state = game_state;
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
        return String.valueOf(this.id);
    }

}
