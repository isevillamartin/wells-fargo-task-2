package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false, foreignKey = @ForeignKey(name = "client"))
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(Date creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() { return creationDate; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

}
