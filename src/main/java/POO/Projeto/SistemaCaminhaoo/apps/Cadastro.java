package POO.Projeto.SistemaCaminhaoo.apps;
import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import POO.Projeto.SistemaCaminhaoo.Repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cadastro {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public void  cadastrarNovoUsuario(Usuario usuario){

        repositorioUsuario.save(usuario);
    }
}
