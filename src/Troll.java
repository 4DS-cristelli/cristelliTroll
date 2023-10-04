import java.util.Objects;

public class Troll {
    private String nome;
    private int puntiFerita;

    public Troll(String nome, int puntiFerita)throws Exception{
        if(puntiFerita>= 0){
            if(nome != null && !nome.equals("")){
                this.puntiFerita = puntiFerita;
                this.nome = nome;
            }else{
                throw new Exception("Nome errato");
            }

        }else{
            throw new Exception("Punti ferita non validi");
        }
    }

    public int getPuntiFerita() {
        return puntiFerita;
    }

    public String getNome() {
        return nome;
    }

}
