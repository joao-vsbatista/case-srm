package com.srm.currency.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
    
    @Column(precision = 10, scale = 4)
    private Long quantity;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_currency_id", nullable = false)
    private Currency fromCurrency;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_currency_id", nullable = false)
    private Currency toCurrency;
    
    @Column(name = "original_amount", nullable = false, precision = 15, scale = 4)
    private Long originalAmount;
    
    @Column(name = "converted_amount", nullable = false, precision = 15, scale = 4)
    private Long convertedAmount;
    
    @Column(name = "exchange_rate", nullable = false, precision = 15, scale = 8)
    private Long exchangeRate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_kingdom_id", nullable = false)
    private Kingdom fromKingdom;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_kingdom_id", nullable = false)
    private Kingdom toKingdom;
    
    @Column(name = "transaction_date")
    @Builder.Default
    private LocalDateTime transactionDate = LocalDateTime.now();
    
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
