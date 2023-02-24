package ejercicios.ejercito;

public class Main {
    public static void main(String[] args) {
        //5 unidades
        Unidad u02 = new Unidad("02");
        Unidad u01 = new Unidad("01");
        Unidad u03 = new Unidad("03");
        Unidad u04 = new Unidad("04");
        Unidad u05 = new Unidad("05");

        //3 caballeros
        Caballero c1 = new Caballero("1");
        Caballero c2 = new Caballero("2");
        Caballero c3 = new Caballero("3");

        //1 general
        General g1 = new General("1");

        //1 medico
        Medico m1 = new Medico("1");

        System.out.println("Unidades: "+Unidad.getUnidades()+"\n"+//al ser una variable private static tengo que hacer un get() para obtener su valor
                            "Caballeros: "+Caballero.caballeros+"\n"+//al ser una variable public static puedo llamar a la variable en cualquier sitio del paquete
                            "Generales: "+General.generales+"\n"+
                            "Medicos: "+Medico.medicos);

        
    }
}
