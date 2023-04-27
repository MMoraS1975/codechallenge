package com.pfcti.codechallenge.repository;

import com.pfcti.codechallenge.model.Cliente;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>, JpaSpecificationExecutor<Cliente> {

    @Query(value = "select nombre, apellidos, cedula, telefono, id from Cliente")
    List<Cliente> buscarAllCliente();

    List<Cliente> findClientesByCedula(String cedula);
}
