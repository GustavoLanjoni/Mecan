package com.mecanica.service;

import com.mecanica.model.Veiculo;
import com.mecanica.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo buscarPorPlaca(String placa) {
        return veiculoRepository.findByPlaca(placa);
    }
}
