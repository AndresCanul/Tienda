package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean articulo);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
}
