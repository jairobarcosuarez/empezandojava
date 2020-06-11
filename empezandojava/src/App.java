public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("empezamos a aprender java");
               //definición de variables
               String nombre;
               int salario;
               boolean sexo;//true: mujeres, false: hombres
               nombre = "Corona Virus - Covid 19";
               salario = 1000000;
               sexo = true;
               System.out.println("El virus que nos tiene confundidos es: "+nombre);
               System.out.println("El salario es: "+salario);
               /*
                   P = Femenino
                   ~P = Masculino
               */
               if (sexo) // Si es mujer
               {
                   System.out.println("Es Mujer");
               }
               //ciclo para (for)
               //int i;
               /*for (int i = 1; i <= 5; i++)
               {
                   System.out.println("El valor de i es: "+i);
               }*/
               int i = 1;
               while (i <= 5)
               {
                   System.out.println("El valor de i es: "+i);
                   //i = i + 1;
                   //i += 1;
                   i++;
               }
    }
}
