package com.microsoft.whtch.repository.specification;

import com.microsoft.whtch.entity.Watch;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface DiscountSpecifications {
    Specification<Watch> findAll(List<Long> ids);
}
