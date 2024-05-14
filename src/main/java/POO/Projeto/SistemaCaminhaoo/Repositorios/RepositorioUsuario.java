package POO.Projeto.SistemaCaminhaoo.Repositorios;

import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String nome);
}
