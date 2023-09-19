package Interfaces;

import AtencionUniversidadDTO.AtencionDTO;

import java.io.IOException;
import java.util.List;

public interface IAtencion {
    AtencionDTO findById(int id);
    List<AtencionDTO> findAll() throws IOException, ClassNotFoundException;
    void save(AtencionDTO Atencion) throws IOException;
    void update( AtencionDTO Atencion) throws IOException;
    void delete(AtencionDTO Atencion) throws IOException;
}
