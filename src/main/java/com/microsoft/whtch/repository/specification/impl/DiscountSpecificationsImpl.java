package com.microsoft.whtch.repository.specification.impl;

import com.microsoft.whtch.entity.Watch;
import com.microsoft.whtch.repository.specification.DiscountSpecifications;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiscountSpecificationsImpl implements DiscountSpecifications {
    @Override
    public Specification<Watch> findAll(List<Long> ids) {
        return (root, query, criteriaBuilder) -> root.get("id").in(ids);
    }
}
