package com.ghaith.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    private long idPlayer;

    // Getters and setters
    public long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }
}
