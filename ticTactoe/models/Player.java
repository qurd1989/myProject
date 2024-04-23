package models;

public class Player {

    private int id;
    private String name;
    private playerType playerType;

    public models.playerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(models.playerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
