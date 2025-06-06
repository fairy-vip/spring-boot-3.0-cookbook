package com.packt.football.repo;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "users")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    @OneToMany(mappedBy = "owner")
    private List<CardEntity> ownedCards;

    @OneToMany(mappedBy = "owner")
    private Set<AlbumEntity> ownedAlbums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CardEntity> getOwnedCards() {
        return ownedCards;
    }

    public void setOwnedCards(List<CardEntity> ownedCards) {
        this.ownedCards = ownedCards;
    }

    public Set<AlbumEntity> getOwnedAlbums() {
        return ownedAlbums;
    }

    public void setOwnedAlbums(Set<AlbumEntity> ownedAlbums) {
        this.ownedAlbums = ownedAlbums;
    }
    
}
