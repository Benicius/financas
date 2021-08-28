package com.example.financas.demo.repository;

import com.example.financas.demo.domains.FinancialRelease;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RealeaseRepository extends JpaRepository<FinancialRelease, Long> {}
