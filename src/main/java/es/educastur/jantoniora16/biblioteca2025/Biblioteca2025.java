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

    public Biblioteca2025()
    {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
    }
    
    public static void main(String[] args)
    {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menuPrincipal();
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
            System.out.println("\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
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
            System.out.println("\n\n\n\n\t\t\t\tMENU LIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
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
            System.out.println("\n\n\n\n\t\t\t\tMENU USUARIOS\n");
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
            System.out.println("\n\n\n\n\t\t\t\tMENU PRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - ELIMINAR PRESTAMO");
            System.out.println("\t\t\t\t3 - MODIFICAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADO");
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
                    eliminarPrestamo();
                    break;
                }
                case 3:
                {
                    modificarPrestamo();
                    break;
                }
                case 4:
                {
                    listaPrestamo();
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
        System.out.print("Introduce el ISBN del libro: ");
        String isbn = sc.nextLine();
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
                System.out.print("Nuevo título: ");
                libro.setTitulo(sc.nextLine());
                System.out.print("Nuevo autor: ");
                libro.setAutor(sc.nextLine());
                System.out.print("Nuevo género: ");
                libro.setGenero(sc.nextLine());
                System.out.print("Numero de ejemplares: ");
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
        
    }

    private void eliminarUsuario()
    {
        
    }

    private void modificarUsuario()
    {
        
    }

    private void listaUsuario()
    {
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION DE PRESTAMOS">
    private void nuevoPrestamo()
    {   
        LocalDate hoy = LocalDate.now();
        System.out.println("Identificación del usuario: ");
        int posUsuario = buscaDni(solicitaDni());
        if (posUsuario == -1)
        {
            System.out.println("No es aún usuario de la biblioteca");
        }
        else
        {
            System.out.println("Identificaión del libro: ");
            int posLibro = buscaIsbn(solicitaIsbn());
            if (posLibro == -1)
            {
                System.out.println("El ISBN pertenece a un libro inexistente");
            }
            else if (libros.get(posLibro).getEjemplares() > 0)
            {
                prestamos.add(new Prestamo(libros.get(posLibro), usuarios.get(posUsuario), hoy, hoy.plusDays(15)));
                libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares() - 1);
            }
            else
            {
                System.out.println("No quedan unidades disponibles de este libro");
            }
        }
    }
    
    private void eliminarPrestamo()
    {
        
    }

    private void modificarPrestamo()
    {
        
    }

    private void listaPrestamo()
    {
        for (Prestamo p : prestamos) 
        {
            System.out.println(p);
        }
    } 
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES">
    /**
     * Método para buscar un usuario en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaDni (String dni)
    {
        int pos = -1;
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
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaIsbn (String isbn)
    {
        int pos = -1;
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
//</editor-fold>
}