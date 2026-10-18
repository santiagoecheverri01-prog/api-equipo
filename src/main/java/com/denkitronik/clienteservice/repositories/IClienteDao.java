package com.denkitronik.clienteservice.repositories;

import com.denkitronik.clienteservice.entities.Cliente;
import com.denkitronik.clienteservice.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    List<Region> findAllRegiones();
}