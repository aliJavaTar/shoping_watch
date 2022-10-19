package com.microsoft.whtch.repository;

import com.microsoft.whtch.entity.Discount;
import com.microsoft.whtch.entity.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiscountRepository extends JpaRepository<Discount, Long>, JpaSpecificationExecutor<Discount> {
}
