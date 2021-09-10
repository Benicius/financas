package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.BillsReceive;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface BillsReceiveRepository extends JpaRepository<BillsReceive, Long> {}
