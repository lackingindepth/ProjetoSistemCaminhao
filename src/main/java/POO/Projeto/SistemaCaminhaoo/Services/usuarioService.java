package POO.Projeto.SistemaCaminhaoo.Services;
import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import POO.Projeto.SistemaCaminhaoo.Repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class usuarioService {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    //Service de Cadastro
    public Usuario cadastrarUsuario(Usuario usuario) {

        return repositorioUsuario.save(usuario);
    }
    //Service de Login
    public boolean login(String nomeDeUsuario, String senha){
        Usuario usuario = repositorioUsuario.findByUsername(nomeDeUsuario);
        return usuario != null && usuario.getSenha().equals(senha);
    }
}


