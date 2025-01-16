package com.crosa.learning;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
        ) {
}
