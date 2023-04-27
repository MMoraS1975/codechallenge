package com.pfcti.codechallenge.service;

import com.pfcti.codechallenge.dto.ClienteDto;
import com.pfcti.codechallenge.model.Cliente;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClienteServiceTest {
    @Autowired
    private ClienteService clienteService;
    private EntityManager entityManager;

    @Test
    void insertarCliente() {
        List<Cliente> listaClientes = entityManager.createQuery("SELECT c FROM Cliente c").getResultList();
        System.out.println(">>>>>> Lista antes de insertar:  "+ listaClientes.size());
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("MAINOR");
        clienteDto.setApellidos("MARA");
        clienteDto.setCedula("2525224");
        clienteDto.setTelefono("50685524587");
        clienteDto.setPaisrecidencia("CR");
        clienteDto.setPaisnacimiento("CR");
        clienteDto.setDireccion("BELEN");
        clienteDto.setEstado(true);
        clienteService.insertarCliente(clienteDto);
        listaClientes = entityManager.createQuery("SELECT c FROM Cliente c").getResultList();
        System.out.println(">>>>> Lista despues de insertar: " + listaClientes.size());

        assertEquals(3, listaClientes.size());
    }
}