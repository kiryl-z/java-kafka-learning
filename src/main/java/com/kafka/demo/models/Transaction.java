package com.kafka.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Transaction {

    private String bank;
    private Long clientId;
    private TransactionType orderType;
    private Integer quantity;
    private Double price;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    public Transaction(String bank, Long clientId, TransactionType orderType, Integer quantity, Double price, LocalDateTime createdAt) {
        this.bank = bank;
        this.clientId = clientId;
        this.orderType = orderType;
        this.quantity = quantity;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Long getClientId() { return clientId; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public TransactionType getOrderType() { return orderType; }

    public void setOrderType(TransactionType orderType) { this.orderType = orderType; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
