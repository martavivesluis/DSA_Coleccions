import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Mundo {
    Map<String, Usuario> usuarios = new HashMap<String, Usuario>();//recibimos como clave el nombre del usuario,añade el usuario


    public void añadirObjetoAUsuario(Usuario u, Objeto o) {
        u.MisObjetos.add(o);
    }

    public Boolean crearUsuario(Usuario u) {
        if (usuarios.containsKey(u.Nombre)) {
            return false;
        } else {
            usuarios.put(u.Nombre, u);
            //Usuario usuarioAntiguo = usuarios.putIfAbsent(u.Nombre,u);
            return true;
        }
    }
    public Usuario consultarUsuario(String nombre)
    {
       return usuarios.get(nombre);//si no esta devuelve un null
    }

    public boolean eliminarUsuario(String Nombre)
    {
        Usuario v = usuarios.remove(Nombre);
        if(v == null)
            return false;
        else
            return true;

    }
    public List<Objeto> consultarObjetosDeUsuario(Usuario u)
    {
        return u.MisObjetos;
    }
    public Objeto consultarObjetoDeUsuario(Usuario u, String nombreObjeto)
    {
        return u.getPrimerObjetoLlamado(nombreObjeto);
    }
    public void transferirObjetoEntreUsuarios(Usuario origen,Usuario destino, Objeto o)
    {
        origen.MisObjetos.remove(o);
        destino.MisObjetos.add(o);
    }


}
