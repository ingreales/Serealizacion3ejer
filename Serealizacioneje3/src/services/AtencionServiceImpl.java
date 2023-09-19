package services;

import AtencionUniversidadDTO.AtencionDTO;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AtencionServiceImpl implements Serializable {

        private List<AtencionDTO> Producto;

        public AtencionServiceImpl() throws IOException, ClassNotFoundException {
            Producto = new ArrayList<>();
        }

        @Override
        public AtencionDTO findById(int id) {
            return Producto.stream()
                    .filter(Producto -> Producto.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<AtencionDTO> findAll() throws IOException, ClassNotFoundException {
            Producto = (List<AtencionDTO>) AtencionSerializer.readObjectFromFile("Productos.ax");
            return Producto;
        }

        @Override
        public void save(AtencionDTO atencion) throws IOException {
            Producto.add(atencion);
            AtencionSerializer.writeObjectToFile(Producto, "productos.ax");
        }

        @Override
        public void update(AtencionDTO Atencion) throws IOException {
            AtencionDTO oLdProducto = findById(Atencion.getId());
            if (oLdProducto != null) {
                Producto.remove(oLdProducto);
                Producto.add(Atencion);
                AtencionSerializer.writeObjectToFile(Atencion, "productos.ax");
            }
        }

        @Override
        public void delete(AtencionDTO Producto) throws IOException {
            Producto.remove(Producto);
            AtencionSerializer.writeObjectToFile(Producto, "productos.ax");
        }
    }

