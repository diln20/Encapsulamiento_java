
package encapsulamiento;

/**
 *
 * @author dilan
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        Alumno alu2=new Alumno(1,"dilan","torres");
        Alumno alu1=new Alumno();
        
        System.out.println("id: "+alu2.getId()+" nombre: "+alu2.getNombre()+" apellido: "+alu2.getApellido());
    }
    
}
