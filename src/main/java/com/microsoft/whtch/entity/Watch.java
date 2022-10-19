package com.microsoft.whtch.entity;

import com.microsoft.whtch.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "watch")
public class Watch extends BaseEntity<Long> {

    private String name;
    private Long price;

    @OneToOne
    @JoinColumn(name = "discount_id", referencedColumnName = "id")
    private Discount discount;



}
