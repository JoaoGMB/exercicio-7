
package com.exemplo.fornecedor.repository;

import com.exemplo.fornecedor.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
