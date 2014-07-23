package com.chomnoue.jhipster.neo4j.template.repository;

import com.chomnoue.jhipster.neo4j.template.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
