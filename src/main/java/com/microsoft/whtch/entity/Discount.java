package com.microsoft.whtch.entity;

import com.microsoft.whtch.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "discount")
public class Discount extends BaseEntity<Long> {
    private Long amountDiscount;
    private Long count;
    @OneToOne(mappedBy = "discount")
    private Watch watch;
}
