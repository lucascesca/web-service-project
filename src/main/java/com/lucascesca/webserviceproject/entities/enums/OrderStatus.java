package com.lucascesca.webserviceproject.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        return switch (code) {
            case 1 -> WAITING_PAYMENT;
            case 2 -> PAID;
            case 3 -> SHIPPED;
            case 4 -> DELIVERED;
            case 5 -> CANCELED;
            default -> throw new IllegalArgumentException("Invalid OrderStatus code");
        };
    }
}
