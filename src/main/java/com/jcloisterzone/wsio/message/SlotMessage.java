package com.jcloisterzone.wsio.message;

public class SlotMessage {
    String gameId;
    int number, serial;
    String nickname;
    boolean ai;
    boolean own;

    public SlotMessage(String gameId, int number, int serial, String nickname) {
        super();
        this.gameId = gameId;
        this.number = number;
        this.serial = serial;
        this.nickname = nickname;
    }


    public String getGameId() {
        return gameId;
    }
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public boolean isAi() {
        return ai;
    }
    public void setAi(boolean ai) {
        this.ai = ai;
    }
    public boolean isOwn() {
        return own;
    }
    public void setOwn(boolean own) {
        this.own = own;
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }


}
