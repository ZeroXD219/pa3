package com.Ventas.web.ms.servicio;

import java.util.List;

import com.Ventas.web.ms.modelo.Cliente;
import com.Ventas.web.ms.modelo.DocVenta;



public interface DocVentaServicio {

	public List<DocVenta>ListAllDocVenta();
	public DocVenta getDocVenta(Long id);
	
	public DocVenta createDocVenta ( DocVenta docventa);
	public DocVenta updateDocVenta( DocVenta docventa);
	public DocVenta deleteDocVenta( Long id);
	
	public List<DocVenta> findByCliente(Cliente cliente);
}
