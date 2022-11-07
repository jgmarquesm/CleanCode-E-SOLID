package behavioral.observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {
    private final Date HORA_DA_CEGADA;

    public ChegadaAniversarianteEvent(Date hora_da_cegada) {
        super();
        this.HORA_DA_CEGADA = hora_da_cegada;
    }

    public Date getHORA_DA_CEGADA() {
        return HORA_DA_CEGADA;
    }
}
