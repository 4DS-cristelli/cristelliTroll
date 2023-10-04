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

    public Troll(Troll t1){
        this.nome = t1.nome;
        this.puntiFerita = t1.puntiFerita;
    }

    public int getPuntiFerita() {
        return puntiFerita;
    }

    public String getNome() {
        return nome;
    }

    public void setPuntiFerita(int puntiFerita)throws Exception{
        if(puntiFerita >= 0){
            this.puntiFerita = puntiFerita;
        }else{
            throw new Exception("Punti ferita non validi");
        }
    }

    public void setNome(String nome)throws Exception{
        if(nome != null && !nome.equals("")){
            this.nome = nome;
        }else{
            throw new Exception("Nome errato");
        }
    }

    public String toString(){
        String str = "";
        str = str+ "NOME: " +nome + " HP:"+ puntiFerita;
        return str;
    }




}
