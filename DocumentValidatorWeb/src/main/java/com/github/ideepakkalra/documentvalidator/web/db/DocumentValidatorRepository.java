/**
 * 
 */
package com.github.ideepakkalra.documentvalidator.web.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ideepakkalra.documentvalidator.core.Document;

/**
 * @author Deepak
 *
 */
@Repository
public interface DocumentValidatorRepository extends JpaRepository<Document, Integer> {
}