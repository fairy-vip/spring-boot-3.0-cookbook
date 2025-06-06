package com.packt.football.repo;

import java.time.LocalDate;

public class AlbumEntity {

    private Long id;

    private String title;

    private LocalDate expireDate;

    private Long ownerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwner(Long ownerId) {
        this.ownerId = ownerId;
    }
}
