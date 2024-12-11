package com.mecanica.controller;

import com.mecanica.model.Veiculo;
import com.mecanica.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/cadastro")
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.salvarVeiculo(veiculo); // Salvar novo veículo
    }

    @GetMapping("/buscar/{placa}")
    public Veiculo buscarPorPlaca(@PathVariable String placa) {
        return veiculoService.buscarPorPlaca(placa);
    }
}
