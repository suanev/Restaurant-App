package com.suanev.restaurant.service.validation;

import com.suanev.restaurant.domain.enums.TipoCliente;
import com.suanev.restaurant.dto.ClienteNewDTO;
import com.suanev.restaurant.resources.exceptions.FieldMessage;
import com.suanev.restaurant.service.validation.utils.BR;

import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
    @Override
    public void initialize(ClienteInsert ann) {
    }

    @Override
    public boolean isValid(ClienteNewDTO clienteDTO, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        if(clienteDTO.getTipo().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidSCPF(clienteDTO.getCpfOuCnpj())) {
            list.add(new FieldMessage("cpfOuCnpj", "CPF inválido"));
        }

        if(clienteDTO.getTipo().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidCNPJ(clienteDTO.getCpfOuCnpj())) {
            list.add(new FieldMessage("cpfOuCnpj", "CNPJ inválido"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName()).addConstraintViolation();
        }
        return list.isEmpty();
    }
}
