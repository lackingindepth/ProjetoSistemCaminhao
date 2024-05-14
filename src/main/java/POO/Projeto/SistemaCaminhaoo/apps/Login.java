package POO.Projeto.SistemaCaminhaoo.apps;
import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import POO.Projeto.SistemaCaminhaoo.Repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    //Login
    public boolean realizarLogin(String nome, String senha){
        Usuario usuario = repositorioUsuario.findByUsername(nome);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return true; // Login bem-sucedido
        }
        return false; // Login falhou
    }

    }
