
package pagoapp.service;

import pagoapp.dto.PagoDto;

/**
 *
 * @author EMMANUEL
 */
public class PagoService {
    public void Procesar(PagoDto pagoDto){
        //Variables
        double ingresos , renta , neto;
        //Proceso
        ingresos = pagoDto.getHorasDia() * pagoDto.getDias() * pagoDto.getPagoHora();
        
        if (ingresos > 1500.00) {
            renta = ingresos * 0.08;
        } else{
            renta = 0;
        }
        neto = ingresos - renta;
        //Salida
        pagoDto.setIngresos(ingresos);
        pagoDto.setRenta(renta);
        pagoDto.setNeto(neto);  
    }
}
