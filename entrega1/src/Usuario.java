import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    public String Nombre;
    public String Password;
    private int Nivel;
    private int Ataque;
    private int Defensa;
    private int Resistencia;
    List<Objeto> MisObjetos = new ArrayList<Objeto>();

    public Usuario(String nombre,String c,int n,int a, int d, int r)//constructor
    {   this.Nombre = nombre;
        this.Password = c;
        this.Nivel = n;
        this.Ataque = a;
        this.Defensa = d;
        this.Resistencia = r;

    }
    public Objeto getPrimerObjetoLlamado(String nombreDeObjeto){
        for (Objeto miobjeto:MisObjetos)
        {
            if(miobjeto.Nombre.equals(nombreDeObjeto))
                return miobjeto;
        }
        return null;
    }
    public Objeto eliminarObjetoPorNombre(String nombreObjeto)
    {
        Objeto aborrar = null;
        for (Objeto miobjeto:MisObjetos)
        {
            if(miobjeto.Nombre.equals(nombreObjeto))
            {
                aborrar = miobjeto;
            }
        }
        if(aborrar == null){
            return null;
        }
        MisObjetos.remove(aborrar);
        return  aborrar;
    }

}
