package com.pfcti.codechallenge.service;

import com.pfcti.codechallenge.dto.ClienteDto;
import com.pfcti.codechallenge.model.Cliente;
import com.pfcti.codechallenge.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class ClienteService {

    private ClienteRepository clienteRepository;

    public void insertarCliente(ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellidos(clienteDto.getApellidos());
        cliente.setCedula(clienteDto.getCedula());
        cliente.setTelefono(clienteDto.getTelefono());
        cliente.setPaisrecidencia(clienteDto.getPaisrecidencia());
        cliente.setPaisnacimiento(clienteDto.getPaisnacimiento());
        cliente.setDireccion(clienteDto.getDireccion());
        cliente.setEstado(clienteDto.getEstado());
        clienteRepository.save(cliente);
    }

//    private ClienteDto fromClienteToClienteDto(Cliente cliente) {
//        ClienteDto clienteDto = new ClienteDto();
//        BeanUtils.copyProperties(cliente, clienteDto);
//        return clienteDto;
//    }

}
