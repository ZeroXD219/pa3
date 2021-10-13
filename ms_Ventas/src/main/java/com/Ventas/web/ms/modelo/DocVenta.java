package com.Ventas.web.ms.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "Docventa")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DocVenta {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long iddoc;
	private String tipodoc; 
	private String observacion;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "idcliente")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Cliente cliente;
}
