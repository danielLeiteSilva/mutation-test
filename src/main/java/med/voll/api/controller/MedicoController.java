package med.voll.api.controller;

import med.voll.api.dto.CadastroMedicoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/medicos")
public class MedicoController {

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody CadastroMedicoDTO cadastroMedicoDTO){
        System.out.println(cadastroMedicoDTO);
    }

}
