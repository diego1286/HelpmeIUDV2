package com.co.ed.iudigital.util;

import com.co.ed.iudigital.dto.DelitoDTO;
import java.util.List;
import java.util.stream.Collectors;
import com.co.ed.iudigital.model.Delito;
import org.springframework.beans.BeanUtils;

public interface Helper {

    public static DelitoDTO convertDelitoToDelitoDTO(Delito delito) {
        DelitoDTO delitoDTO = new DelitoDTO();
        BeanUtils.copyProperties(delito, delitoDTO);
        return delitoDTO;
    }

    public static Delito convertDelitoDTOToDelito(DelitoDTO delitoDTO) {
        Delito delito = new Delito();
        BeanUtils.copyProperties(delitoDTO, delito);
        return delito;
    }

    public static List<DelitoDTO> convertListDelitoDTO(
            List<Delito> delitos){
        return delitos
                .stream()
                .map(d -> {
                    return convertDelitoToDelitoDTO(d);
                })
                .collect(Collectors.toList());
    }
}
