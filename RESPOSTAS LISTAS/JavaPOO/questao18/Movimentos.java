package poo.questao18;

import java.math.BigDecimal;
import java.sql.Date;

public class Movimentos {
    public Date hora;
    public BigDecimal valor;

    //getters e setters
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
