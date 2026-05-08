package com.mgcss.track.dto;

import java.time.LocalDate;
import java.util.List;

public record SolicitudResponseDTO(Long id, String estado, LocalDate fechaCreacion, List<String> historialEstados) {
    
}
