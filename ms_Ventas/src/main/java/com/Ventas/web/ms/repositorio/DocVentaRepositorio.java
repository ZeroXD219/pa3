package com.Ventas.web.ms.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ventas.web.ms.modelo.Cliente;
import com.Ventas.web.ms.modelo.DocVenta;



@Repository
public interface DocVentaRepositorio extends JpaRepository<DocVenta, Long> {

	public  List<DocVenta> findByCliente(Cliente cliente);
}
