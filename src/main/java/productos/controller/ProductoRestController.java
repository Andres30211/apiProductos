package productos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "API con js...";
	}
	
}
