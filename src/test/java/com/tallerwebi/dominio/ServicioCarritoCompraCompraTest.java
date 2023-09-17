package com.tallerwebi.dominio;

import com.tallerwebi.dominio.Carrito.Pedido;
import com.tallerwebi.dominio.Carrito.ServicioCarritoCompra;
import com.tallerwebi.dominio.Libro.Libro;
import com.tallerwebi.infraestructura.RepositorioCarritoCompra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ServicioCarritoCompraCompraTest {

    private ServicioCarritoCompra servicioCarritoCompra;
    private Pedido carritoCompra;
    private RepositorioCarritoCompra repositorioCarritoCompra;
    private Usuario usuario;

    @BeforeEach
    public void init(){
        this.servicioCarritoCompra = mock(ServicioCarritoCompra.class);
        this.carritoCompra = mock(Pedido.class);
        this.usuario = mock(Usuario.class);
        this.repositorioCarritoCompra=mock(RepositorioCarritoCompra.class);
    }

    @Test
    public void verificarQueElLibroSeAgregoAlCarrito() {
        /*Agregar un libro y verificar que este*/

        Usuario usuario = new Usuario();
        Libro libro = new Libro(1);

        servicioCarritoCompra.agregarLibroAlCarrito(usuario, libro);

        verify(repositorioCarritoCompra, times(1)).agregarLibroAlCarrito(usuario, libro);

    }

    @Test
    public void NoPermitirAgregarUnLibroAlCarrito(){
        /*Agregar un libro y verificar que devuelva false*/
    }

    @Test
    public void quitarUnLibroDelCarrito(){
        /*Quitar un libro del carrito y verificar que no este mas*/

    }

    @Test
    public void obtenerListaDeLibrosEnCarrito(){
        /*Obtener una lista de los libros del carrito*/
    }

    @Test
    public void actualizarCantidadDeUnLibroEnCarrito(){
        /*Modificar la cantidad de un libro en el carrito*/
    }

}
