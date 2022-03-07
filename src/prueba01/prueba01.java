/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba01;

import pagoapp.dto.PagoDto;
import pagoapp.service.PagoService;

/**
 *
 * @author EMMANUEL
 */
public class prueba01 {
    public static void main(String[] args) {
        PagoDto pagoDto = new PagoDto();
        pagoDto.setHorasDia(6);
        pagoDto.setDias(20);
        pagoDto.setPagoHora(130.0);
        //Proceso
        PagoService pagoService = new PagoService();
        pagoService.Procesar(pagoDto);
        //Resultado
        System.out.println("Ingresos: " + pagoDto.getIngresos());
        System.out.println("Renta: " + pagoDto.getRenta());
        System.out.println("Neto: " + pagoDto.getNeto());
    }
    }

