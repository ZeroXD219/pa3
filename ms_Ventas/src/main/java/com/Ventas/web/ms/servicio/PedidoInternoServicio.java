package com.Ventas.web.ms.servicio;

import java.util.List;

import com.Ventas.web.ms.modelo.PedidoInterno;
import com.Ventas.web.ms.modelo.Producto;



public interface PedidoInternoServicio {

	public List<PedidoInterno>ListAllPedidoInterno();
	public PedidoInterno getPedidoInterno(Long id);
	
	public PedidoInterno createPedidoInterno( PedidoInterno pedidointerno);
	public PedidoInterno updatePedidoInterno(PedidoInterno pedidointerno);
	public PedidoInterno deletePedidoInterno( Long id);
	
	public List<PedidoInterno> findByProducto(Producto producto);
}
