import com.iesemilidarder.pvidal.Actividades;
import com.iesemilidarder.pvidal.Hotel;
import com.iesemilidarder.pvidal.Producto;
import com.iesemilidarder.pvidal.Viaje;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Launcher {
    public static void main(String... args){
        Actividades actividad = new Actividades();
        String[] actividades = actividad.getActiviti();
        System.out.println(actividades);



    }
}
