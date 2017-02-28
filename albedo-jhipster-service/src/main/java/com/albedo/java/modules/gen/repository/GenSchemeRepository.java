package com.albedo.java.modules.gen.repository;

import com.albedo.java.modules.gen.domain.GenScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface GenSchemeRepository extends JpaRepository<GenScheme, String>, JpaSpecificationExecutor<GenScheme> {

	Optional<GenScheme> findOneById(String id);

}