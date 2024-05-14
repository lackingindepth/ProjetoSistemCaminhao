package POO.Projeto.SistemaCaminhaoo.Controller;

import POO.Projeto.SistemaCaminhaoo.Repositorios.RepositorioUsuario;
import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("SistemaCaminhoneiros")
@RestController
public class SystemController {

    @Autowired
    private RepositorioUsuario repository; //Chama a interface RepositórioUsuário.

    @GetMapping
    public List<Usuario> getAll(){ //Busca todos usuários do bd;

        List<Usuario> userList = repository.findAll();
        return userList;
    }
}
