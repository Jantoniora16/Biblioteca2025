package es.educastur.jantoniora16.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Este es el proyecto de la clase biblioteca
 * @author Joseiro
 */
public class Biblioteca2025
{
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;
    private ArrayList <Prestamo> prestamosHist;

    public Biblioteca2025()
    {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
        this.prestamosHist = new ArrayList();
    }
    
    public static void main(String[] args)
    {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menuPrincipal();
        b.fueraPlazo();
    }
    
    private void cargaDatos()
    {
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3));
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3));
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4));
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3));
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2));
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2));
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2));
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3));
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",2));

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111"));
        usuarios.add(new Usuario("22","David","david@email.com","622222222"));
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333"));
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444"));
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555"));
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    }
    
    //<editor-fold defaultstate="collapsed" desc="GESTION DE MENUS">
    private void menuPrincipal()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENÚ PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRÉSTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1:
                {
                    menuLibros();
                    break;
                }
                case 2:
                {
                    menuUsuarios();
                    break;
                }
                case 3:
                {
                    menuPrestamos();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
    
    private void menuLibros()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENÚ LIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR EJEMPLARES");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1:
                {
                    nuevoLibro();
                    break;
                }
                case 2:
                {
                    eliminarLibro();
                    break;
                }
                case 3:
                {
                    modificarLibro();
                    break;
                }
                case 4:
                {
                    listaLibro();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
    
    private void menuUsuarios()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENÚ USUARIOS\n");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1:
                {
                    nuevoUsuario();
                    break;
                }
                case 2:
                {
                    eliminarUsuario();
                    break;
                }
                case 3:
                {
                    modificarUsuario();
                    break;
                }
                case 4:
                {
                    listaUsuario();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
    
    private void menuPrestamos()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENÚ PRÉSTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRÉSTAMO");
            System.out.println("\t\t\t\t2 - DEVOLVER PRÉSTAMO");
            System.out.println("\t\t\t\t3 - PRORROGAR PRÉSTAMO");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t5 - LISTADO POR USUARIO");
            System.out.println("\t\t\t\t6 - LISTADO POR LIBRO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1:
                {
                    nuevoPrestamo();
                    break;
                }
                case 2:
                {
                    devolverPrestamo();
                    break;
                }
                case 3:
                {
                    prorrogarPrestamo();
                    break;
                }
                case 4:
                {
                    listaPrestamo();
                    break;
                }
                case 5:
                {
                    listaPrestamoUsu();
                    break;
                }
                case 6:
                {
                    listaPrestamoLibro();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
//</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="GESTION DE LIBROS">
    private void nuevoLibro()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Añadir Libro ---");   
        String isbn = solicitaIsbn();
        int posLibro = buscaIsbn(isbn);
        
        if (posLibro != - 1)
        {
            Libro libroExistente = libros.get(posLibro);
            System.out.println("El libro con ISBN: " + isbn + " ya está en la biblioteca");
            System.out.println("¿Cuántos ejemplares deseas añadir del libro: " + libroExistente.getTitulo() +"?");
            int ejemplaresAdicionales = sc.nextInt();
            
            libroExistente.setEjemplares(libroExistente.getEjemplares() + ejemplaresAdicionales);
            System.out.println("Se han añadido " + ejemplaresAdicionales + " ejemplares al libro existente.");
        }
        else
        {
        System.out.println("Introduce el título del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Introduce el genero del libro: ");
        String genero = sc.nextLine();
        System.out.println("Introduce la cantidad de libros: ");
        int ejemplares = sc.nextInt();
        
        libros.add(new Libro(isbn, titulo, autor, genero, ejemplares));
        System.out.println("¡Libro añadido con éxito!");
        }
    }

    private void eliminarLibro()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Eliminar Libro ---");
        System.out.print("Introduce el ISBN del libro a borrar: ");
        String isbn = sc.nextLine();
        
        for (int i = 0; i < libros.size(); i++) 
        {
            if (libros.get(i).getIsbn().equals(isbn))
            {
                libros.remove(i);
                System.out.println("¡Libro eliminado con éxito!");
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese ISBN.");
    }

    private void modificarLibro()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Modificar Libro ---");
        System.out.print("Introduce el ISBN del libro a modificar: ");
        String isbn = sc.nextLine();
        
        for (Libro libro : libros)
        {
            if (libro.getIsbn().equals(isbn)) 
            {
                System.out.print("Numero de ejemplares a modificar(Introduce + o - delante del número para sumar o restar ejemplares): ");
                libro.setEjemplares(sc.nextInt());
                System.out.println("¡Libro modificado con éxito!");
                return;
            }
        }
        System.out.println("No se encontró el libro con ese ISBN.");
    }

    private void listaLibro()
    {
        System.out.println("--- Listado de Libros ---");
        for (Libro l : libros) 
        {
            System.out.println(l);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION DE USUARIOS">
    private void nuevoUsuario()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Añadir Usuario ---");   
        System.out.print("Introduce el dni del usuario: ");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el correo del usuario: ");
        String email = sc.nextLine();
        System.out.println("Introduce el numero del usuario: ");
        String telefono = sc.nextLine();
        
        usuarios.add(new Usuario(dni, nombre, email, telefono));
        System.out.println("¡Usuario añadido con éxito!");
    }

    private void eliminarUsuario()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Eliminar Usuario ---");
        System.out.print("Introduce el dni del usuario a borrar: ");
        String dni = sc.nextLine();
        
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if (usuarios.get(i).getDni().equals(dni))
            {
                usuarios.remove(i);
                System.out.println("¡Usuario eliminado con éxito!");
                return;
            }
        }
        System.out.println("No se encontró ningún Usuario con ese dni.");
    }

    private void modificarUsuario()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Modificar Usuario ---");
        System.out.print("Introduce el dni del usuario a modificar: ");
        String dni = sc.nextLine();
        
        for (Usuario usuario : usuarios)
        {
            if (usuario.getDni().equals(dni)) 
            {
                System.out.print("Nuevo dni: ");
                usuario.setDni(sc.nextLine());
                System.out.print("Nuevo nombre: ");
                usuario.setNombre(sc.nextLine());
                System.out.print("Nuevo email: ");
                usuario.setEmail(sc.nextLine());
                System.out.print("Numero de telefono nuevo: ");
                usuario.setTelefono(sc.nextLine());
                System.out.println("¡Usuario modificado con éxito!");
                return;
            }
        }
        System.out.println("No se encontró el usuario con ese dni.");
    }

    private void listaUsuario()
    {
        System.out.println("--- Listado de Usuarios ---");
        for (Usuario u : usuarios) 
        {
            System.out.println(u);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION DE PRESTAMOS">
    private void nuevoPrestamo()
    {
        System.out.println("--- Añadir Préstamo ---");
        System.out.println("Identificación del usuario: ");
        String dni = solicitaDni();
        int posUsuario = buscaDni(dni);
        if (posUsuario == - 1)
        {
            System.out.println("No es aún usuario de la biblioteca");
        }
        else
        {
            System.out.println("Identificación del libro: ");
            String isbn = solicitaIsbn();
            int posLibro = buscaIsbn(isbn);
            if (posLibro == - 1)
            {
                System.out.println("El ISBN pertenece a un libro inexistente");
            }
            else if (libros.get(posLibro).getEjemplares() > 0)
            {
                if ((buscaPrestamo(dni,isbn)) == - 1)
                {
                    LocalDate hoy = LocalDate.now();
                    prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                    libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                }
                else
                {
                    System.out.println("Ese usuario ya tiene ese mismo libro en prestamo");
                }
            }
            else
            {
                System.out.println("No quedan unidades disponibles del libro");
            }
        }
    }
    
    private void devolverPrestamo()
    {
        System.out.println("--- Devolver préstamo ---");
        String isbnLibro = solicitaIsbn();
        int pos = buscaPrestamo(solicitaDni(),isbnLibro);
        if (pos == - 1)
        {
            System.out.println("No hay ningún préstamo con esos datos");
        }
        else
        {
            prestamos.get(pos).setFechaDev(LocalDate.now());
            libros.get(buscaIsbn(isbnLibro)).setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares() + 1);
            prestamosHist.add(prestamos.get(pos));
            prestamos.remove(pos);
            System.out.println("¡Préstamo devuelto con éxito!");
        }
    }

    private void prorrogarPrestamo()
    {
        System.out.println("--- Prorrogar préstamo 15 días ---");
        
        String dni = solicitaDni();
        String isbn = solicitaIsbn();
        int pos = buscaPrestamo(dni,isbn);
        
        if (pos == - 1)
        {
            System.out.println("No hay ningún préstamo con esos datos");
        }
        else
        {
            prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
            prestamos.get(pos).setFechaPrest(LocalDate.now());
            System.out.println("¡Préstamo prorrogado con éxito!");
        }
    }

    private void listaPrestamo()
    {
        System.out.println("--- Listado de préstamos Activos---");
        for (Prestamo p : prestamos) 
        {
            System.out.println(p);
        }
        System.out.println("--- Listado de Préstamos Históricos");
        for (Prestamo ph : prestamosHist)
        {
            System.out.println(ph);
        }
    }
    
    private void listaPrestamoUsu()
    {
        String dni = solicitaDni();
        int pos = buscaDni(dni);
        
        if (pos == -1)
        {
            System.out.println("No hay usuarios con ese DNI");
        }
        else
        {
            System.out.println("--- Listado de Préstamos Activos---");
            System.out.println("Préstamos activos de: " + usuarios.get(pos).getNombre());
            for (Prestamo p : prestamos) 
            {
                if (p.getUsuarioPrest().getDni().equals(dni))
                {
                    if (p.getFechaDev().isBefore(LocalDate.now()))
                    {
                        System.out.println("Libro fuera de plazo: ");
                    }
                    System.out.println(p);
                }
            }
            System.out.println("--- Listado de Préstamos Históricos");
            System.out.println("Préstamos históricos de: " + usuarios.get(pos).getNombre());
            for (Prestamo ph : prestamosHist)
            {
                if (ph.getUsuarioPrest().getDni().equals(dni))
                {
                    System.out.println(ph);
                }
            }
        }
    }
    
    private void listaPrestamoLibro()
    {
        String isbn=solicitaIsbn();
        int pos=buscaIsbn(isbn);
        if (pos==-1)
        {
            System.out.println("No tengo ningún libro con ese ISBN");
        }
        else
        {
            System.out.println("Usuarios/as que lo estan leyendo");
            for (Prestamo p : prestamos)
            {
                if (p.getLibroPrest().getIsbn().equals(isbn))
                {
                    System.out.println(p.getUsuarioPrest());
                }
            }
            
            System.out.println("Usuarios/as que ya lo han leido");
            for (Prestamo p : prestamosHist)
            {
                if (p.getLibroPrest().getIsbn().equals(isbn))
                {
                    System.out.println(p.getUsuarioPrest());
                }
            }
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES">
    /**
     * Método para buscar un usuario en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor - 1 si no se encuentra
     */
    public int buscaDni (String dni)
    {
        int pos = - 1;
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if (usuarios.get(i).getDni().equalsIgnoreCase(dni))
            {
                pos = i;
                break;
            }     
        }
        return pos;
    }
    
    /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor - 1 si no se encuentra
     */
    public int buscaIsbn (String isbn)
    {
        int pos = - 1;
        for (int i = 0; i < libros.size(); i++) 
        {
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn))
            {
                pos = i;
                break;
            }     
        }
        return pos;
    }
    
    /**
     * Método para solicitar por teclado el DNI de un usuario. Pdte de validación
     * @return (String) dni de un usuario tecleado
     */
    public String solicitaDni ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el dni del usuario: ");
        String dni = sc.next();
        return dni;
    }
    
    /**
     * Método para solicitar por teclado el ISBN de un libro. Pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String solicitaIsbn ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el isbn del libro: ");
        String isbn = sc.next();
        return isbn;
    }
    
    /**
     * Método para buscar un préstamo en la colección préstamos
     * @param dni (String) del usuario que realizó el préstamo
     * @param isbn (String) del libro prestado
     * @return posición (int) del préstamo en el Arraylist,valor - 1 si no se encuentra un préstamo con esos datos
     */
    public int buscaPrestamo(String dni, String isbn)
    {
        int pos = - 1;
        for (int i = 0; i < prestamos.size(); i++)
        {
            if (prestamos.get(i).getUsuarioPrest().getDni().equals(dni)
                && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn))
            {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    /**
     * Método para ver los préstamos fuera de plazo
     * @return
     */
    public void fueraPlazo()
    {
        System.out.println("Prestamos fuera de plazo:");
        for (Prestamo p : prestamos)
        {
            if (p.getFechaDev().isBefore(LocalDate.now()))
            {
                System.out.println(p);
            }
        }
    }
//</editor-fold>
}