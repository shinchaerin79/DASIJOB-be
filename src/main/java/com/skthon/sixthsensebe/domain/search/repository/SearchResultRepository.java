package com.skthon.sixthsensebe.domain.search.repository;

import com.skthon.sixthsensebe.domain.search.entity.SearchResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SearchResultRepository extends JpaRepository<SearchResult, Long> {

  Optional<SearchResult> findFirstByOrderByCreatedAtDesc();
}
