package ejercicios.tiendaFiguras;

public class Main {
    public static void main(String[] args) {
        Superheroe spiderman = new Superheroe("Spiderman");
        spiderman.setDescripcion("Lanza tela de araña y viste de rojo.");
        System.out.println(spiderman.nombre() );
        System.out.println(spiderman.descripcion());

        System.out.println(spiderman.toString());

       Superheroe batman = new Superheroe("Batman");
       batman.setCapa(true);
       batman.setDescripcion("Tiene los poderes de un murciélago.");
        System.out.println(batman.toString());

        Dimension dimPeq = new Dimension();
        Dimension dimGra = new Dimension(70, 20, 20);
        dimPeq.setAlto(20);
        dimPeq.setAncho(5);
        dimPeq.setProfundidad(6);

        System.out.println(dimPeq.toString());
        System.out.println(dimGra.toString());
        System.out.println("Volumen de la dimension pequeña "+dimPeq.getVolumen());

        Figura figSpi = new Figura("spid-01",30,spiderman,dimPeq);
        System.out.println(figSpi.toString());
        figSpi.subirPrecio(10);
        System.out.println(figSpi.toString());

        Coleccion col = new Coleccion("Super");
        col.añadirFigura(figSpi);

        Figura figBat = new Figura("bat-02",50,batman,dimPeq);
        col.añadirFigura(figBat);

        Superheroe sup3 = new Superheroe("Ironman");
        sup3.setDescripcion("Superhéroe con traje de metal capaz de volar");
        Figura figIron = new Figura("iron-03",20,sup3,new Dimension(6,3,4));
        col.añadirFigura(figIron);

        Superheroe sup4 = new Superheroe("Superman");
        sup4.setCapa(true);

        Figura figSup = new Figura("sup-04", 150, sup4,new  Dimension(100, 8, 5));

        col.añadirFigura(figSup);

        System.out.println(col);

        System.out.println(col.conCapa());

        Figura fMasValiosa = col.masValioso();
        System.out.println("Figura de más valor: "+fMasValiosa);

        System.out.println("Valor de la coleccion: "+col.getValorColeccion());

        System.out.println("Volumen de la coleccion: "+col.getVolumenColeccion());
    }
}
