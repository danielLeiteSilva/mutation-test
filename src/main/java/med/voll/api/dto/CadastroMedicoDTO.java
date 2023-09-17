package med.voll.api.dto;

import med.voll.api.medico.EspecialidadeENUM;

public record CadastroMedicoDTO(String nome, String email, String crm, EspecialidadeENUM especialidade, EnderecoDTO endereco) {
}