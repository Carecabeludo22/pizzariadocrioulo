package com.itb.inf2fm.pizzariadocrioulo.controller;

import com.itb.inf2fm.pizzariadocrioulo.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controler: Sistema web (Sites em geral)
//@RestController: Api

@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController{
    //Ligando meu controlador com o respectivo serviço
    private ProdutoService produtoService = new ProdutoService();
}


public class ProdutoController {
}
