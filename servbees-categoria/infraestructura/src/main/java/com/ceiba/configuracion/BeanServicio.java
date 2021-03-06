package com.ceiba.configuracion;

import com.ceiba.categoria.puerto.repositorio.RepositorioCategoria;
import com.ceiba.categoria.servicio.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearCategoria servicioActualizarCategoria(RepositorioCategoria repositorioCategoria) {
        return new ServicioCrearCategoria(repositorioCategoria);
    }

    @Bean
    public ServicioEliminarCategoria servicioEliminarCategoria(RepositorioCategoria repositorioCategoria) {
        return new ServicioEliminarCategoria(repositorioCategoria);
    }
	

}
