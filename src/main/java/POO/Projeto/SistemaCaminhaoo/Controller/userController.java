package POO.Projeto.SistemaCaminhaoo.Controller;

import POO.Projeto.SistemaCaminhaoo.Model.Usuario;
import POO.Projeto.SistemaCaminhaoo.Services.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RequestMapping("/SistemaCaminhao")
@RestController
public class userController {

    @Autowired
    private usuarioService usuarioService;

    //Endpoint para cadastro de usuario
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.cadastrarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    //Endpoint para logar usuarios
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        boolean loginValido = usuarioService.login(usuario.getNomeDeUsuario(), usuario.getSenha());
        if (loginValido) {
            return ResponseEntity.ok("Login bem-sucedido!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas!");
        }
    }
}
