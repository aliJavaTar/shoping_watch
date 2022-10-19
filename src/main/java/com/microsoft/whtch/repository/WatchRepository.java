package com.microsoft.whtch.repository;

import com.microsoft.whtch.entity.Watch;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Collection;
import java.util.List;

public interface WatchRepository extends JpaRepository<Watch, Long>, JpaSpecificationExecutor<Watch> {
    List<Watch> findAll(Specification specification);

//    List<Watch> findAllByIdIn(Collection<Long> id);

}
