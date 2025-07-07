package Model;

/**
 *
 * @author ADM
 */
public class Cliente {
    
    protected String id, nome, sexo, classe;

    public Cliente(String id, String nome, String sexo, String classe) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.classe = classe;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    

    

}
