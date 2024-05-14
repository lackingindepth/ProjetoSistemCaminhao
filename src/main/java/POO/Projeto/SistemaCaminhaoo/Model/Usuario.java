package POO.Projeto.SistemaCaminhaoo.Model;

import jakarta.persistence.*;

/* Essa classe mapeia uma entidade, baseado na tabela do postgresql.*/

@Table(name = "usuario")
@Entity(name = "usuario")
public class Usuario extends Pessoa {

    //Atributos da tabela sql.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Chave primária
    private String nomeDeUsuario;
    private String senha;

    public Usuario(Long id, String nome, String cpf, String email, String telefone, String nomeDeUsuario, String senha){
        super(nome,cpf,email,telefone);
        this.id = id;
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
    }

    public void setNomeDeUsuario(){
        this.nomeDeUsuario = nomeDeUsuario;
    }
    public String getNomeDeUsuario(){
        return nomeDeUsuario;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

}
