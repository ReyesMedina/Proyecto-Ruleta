package dev.rmpedro.appruleta.datos;

import dev.rmpedro.appruleta.enums.Color;
import dev.rmpedro.appruleta.models.entities.Ruleta;

import java.util.Date;

public class RuletaDatosDummy {

    public static Ruleta ruleta01(){
        return new Ruleta(1,false,Color.NEGRO,10,new Date(),null);
    }

    public static String ruletaIdJson01() {
        return ruleta01().getId().toString();
    }
    public static String ruletaEstadoJson01() {

        return ruleta01().getEstaAbierta().toString();
    }

    public static Ruleta ruleta02(){
        return new Ruleta(2,false,Color.NEGRO,10,new Date(),null);
    }




}

