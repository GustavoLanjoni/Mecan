package com.mecanica.repository;

import com.mecanica.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Veiculo findByPlaca(String placa);
}
