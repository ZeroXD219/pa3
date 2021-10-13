package com.Ventas.web.ms.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ventas.web.ms.modelo.PedidoInterno;
import com.Ventas.web.ms.modelo.Producto;




@Repository
public interface PedidoInternoRespositorio extends JpaRepository<PedidoInterno, Long>{

	public  List<PedidoInterno> findByProducto(Producto producto);
}
