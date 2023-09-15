package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.libro.Libro;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Repository
@Transactional
public class RepositorioLibroImpl implements RepositorioLibro {
    private SessionFactory sessionFactory;

    public RepositorioLibroImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Set<Libro> getLibros() {
        Set<Libro> libros = new HashSet<>();
        return libros;

    }

    public Libro buscarLibroPorId(Long id) {
        return (Libro) this.sessionFactory.getCurrentSession().createCriteria(Libro.class)
                .add(Restrictions.eq("ID", id)).uniqueResult();
    }
}
