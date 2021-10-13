package com.Ventas.web.ms.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Ventas.web.ms.modelo.Cliente;
import com.Ventas.web.ms.modelo.DocVenta;
import com.Ventas.web.ms.repositorio.DocVentaRepositorio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocVentaServicioImplementa implements DocVentaServicio{

	public final DocVentaRepositorio docventaRepositorio;
	
	@Override
	public List<DocVenta> ListAllDocVenta() {
		// TODO Auto-generated method stub
		return docventaRepositorio.findAll();
	}

	@Override
	public DocVenta getDocVenta(Long id) {
		// TODO Auto-generated method stub
		return docventaRepositorio.findById(id).orElse(null);
	}

	@Override
	public DocVenta createDocVenta(DocVenta docventa) {
		// TODO Auto-generated method stub
		return docventaRepositorio.save(docventa);
	}

	@Override
	public DocVenta updateDocVenta(DocVenta docventa) {
DocVenta docventaUpdate = getDocVenta(docventa.getIddoc());
		
		if (docventaUpdate == null) {
			return null;
		}
		
		docventaUpdate.setCliente(docventa.getCliente());
		docventaUpdate.setTipodoc(docventa.getTipodoc());
		docventaUpdate.setObservacion(docventa.getObservacion());
		
		return docventaRepositorio.save(docventaUpdate);
	}

	@Override
	public DocVenta deleteDocVenta(Long id) {
DocVenta docventaDelete = getDocVenta(id);
		
		if (docventaDelete == null) {
			return null;
		}		
		
		docventaDelete.setTipodoc("ELIMINADO");
		docventaDelete.setObservacion("ELIMINADO");
		return docventaRepositorio.save(docventaDelete);
	}

	@Override
	public List<DocVenta> findByCliente(Cliente cliente) {
		return docventaRepositorio.findByCliente(cliente);
	}

}
