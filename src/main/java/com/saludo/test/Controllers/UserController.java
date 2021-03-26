package com.saludo.test.Controllers;

import com.saludo.test.Entities.Frase;
import com.saludo.test.Entities.Numero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @GetMapping("/convertirMorse/{frase}")
    @ResponseBody
    public String getFrase(@PathVariable("frase") String frase) {
        Frase frase1 = new Frase(frase);
        frase1.convertirFraseAEspaniol();
        return frase1.mostrarFrase();
    }


}
