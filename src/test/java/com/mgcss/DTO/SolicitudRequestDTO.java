package com.mgcss.track.dto;

import jakarta.validation.constraints.NotNull;

public record SolicitudRequestDTO(
    @NotNull(message = "El ID de la solicitud es obligatorio") 
    Long id 
) {}