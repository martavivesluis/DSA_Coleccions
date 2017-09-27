import java.util.List;
public class Main {

    public static void main(String[] args) {
        Usuario usera = new Usuario("Alberto","kggyly",2,3,4,10) ;
        Usuario userb = new Usuario("Borja","1234",2,3,4,10) ;
        Usuario userc = new Usuario("Carolina","kggyly",2,3,4,10) ;
        Usuario userd = new Usuario("Dominico","kggyly",2,3,4,10) ;

        Objeto casa = new Objeto("casa","descripcio","drdrdr",1,2);
        Objeto vaso = new Objeto("vaso","descripcio","drdrdr",1,2);
        Objeto coche = new Objeto("coche","descripcio","drdrdr",1,2);
        Objeto ventana = new Objeto("ventana","descripcio","drdrdr",1,2);
        Objeto olivo = new Objeto("olivo","descripcio","drdrdr",1,2);

        Mundo m = new Mundo();

        m.crearUsuario(usera);
        m.crearUsuario(userb);
        m.crearUsuario(userc);
        m.crearUsuario(userd);

        m.añadirObjetoAUsuario(usera,olivo);
        m.añadirObjetoAUsuario(userb,casa);
        m.añadirObjetoAUsuario(userb,vaso);

        List arr = m.consultarObjetosDeUsuario(userb);
        Usuario temp = m.consultarUsuario("Borja");
        System.out.println(temp.Password);
        Usuario temp3 = m.consultarUsuario("Alberto");
        m.consultarObjetosDeUsuario(temp3);

        m.transferirObjetoEntreUsuarios(temp,temp3,vaso);

        Usuario temp4 = m.consultarUsuario("Alberto");
        m.consultarObjetosDeUsuario(temp4);


        m.eliminarUsuario("Borja");

        Usuario temp2 = m.consultarUsuario("Borja");


    }

}
