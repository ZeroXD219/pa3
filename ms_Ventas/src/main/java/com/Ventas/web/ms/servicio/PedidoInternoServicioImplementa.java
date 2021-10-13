package com.Ventas.web.ms.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Ventas.web.ms.modelo.PedidoInterno;
import com.Ventas.web.ms.modelo.Producto;
import com.Ventas.web.ms.repositorio.PedidoInternoRespositorio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PedidoInternoServicioImplementa implements PedidoInternoServicio {

	public final PedidoInternoRespositorio pedidointernoRepositorio;
	
	@Override
	public List<PedidoInterno> ListAllPedidoInterno() {
		// TODO Auto-generated method stub
		return pedidointernoRepositorio.findAll();
	}

	@Override
	public PedidoInterno getPedidoInterno(Long id) {
		// TODO Auto-generated method stub
		return pedidointernoRepositorio.findById(id).orElse(null);
	}

	@Override
	public PedidoInterno createPedidoInterno(PedidoInterno pedidointerno) {
		return pedidointernoRepositorio.save(pedidointerno);
	}

	@Override
	public PedidoInterno updatePedidoInterno(PedidoInterno pedidointerno) {
PedidoInterno pedidointernoUpdate = getPedidoInterno(pedidointerno.getIdpedido());
		
		if (pedidointernoUpdate == null) {
			return null;
		}
		
		pedidointernoUpdate.setCantidad(pedidointerno.getCantidad());
		pedidointernoUpdate.setProducto(pedidointerno.getProducto());
		
		
		return pedidointernoRepositorio.save(pedidointernoUpdate);
	}

	@Override
	public PedidoInterno deletePedidoInterno(Long id) {
PedidoInterno pedidointernoDelete = getPedidoInterno(id);
		
		if (pedidointernoDelete == null) {
			return null;
		}		
		
		pedidointernoDelete.setCantidad(0);
		return pedidointernoRepositorio.save(pedidointernoDelete);
	}

	@Override
	public List<PedidoInterno> findByProducto(Producto producto) {
		return pedidointernoRepositorio.findByProducto(producto);
	}

}
