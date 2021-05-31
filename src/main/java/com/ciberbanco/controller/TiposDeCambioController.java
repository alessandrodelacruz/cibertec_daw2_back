package com.ciberbanco.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ciberbanco.entity.TiposDeCambio;
import com.ciberbanco.service.TiposDeCambioService;

@RestController
@RequestMapping("/tiposDeCambio")
public class TiposDeCambioController {

	@Autowired
	private TiposDeCambioService tiposDeCambioService;

	@GetMapping("/lista")
	@ResponseBody
	public List<TiposDeCambio> lista() {
		return tiposDeCambioService.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody TiposDeCambio bean) {
		tiposDeCambioService.save(bean);
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody TiposDeCambio bean) {
		tiposDeCambioService.save(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		tiposDeCambioService.delete(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<TiposDeCambio> buscar(@PathVariable("codigo") Integer cod) {
		return tiposDeCambioService.find(cod);
	}

//	@GetMapping("/tc")
//	public List<TiposDeCambio> listar(){
//		return tiposDeCambioService.findAll();
//	}
//	
//	@PostMapping("/tc")
//	@ResponseStatus(HttpStatus.CREATED)
//	public TiposDeCambio save(@RequestBody TiposDeCambio tc) {
//		return tiposDeCambioService.save(tc);
//	}

}
