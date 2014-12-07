package biblioteca.main;

import biblioteca.builder.CategoriaBuilder;
import biblioteca.builder.ItemBuilder;
import biblioteca.cats.Categoria;
import biblioteca.cats.ListaCategoria;
import biblioteca.items.Item;
import biblioteca.items.Libro;
import biblioteca.items.Revista;
import biblioteca.menu.CodigoItem;
import biblioteca.menu.Consola;
import biblioteca.menu.Menu;
import biblioteca.menu.MenuItem2;
import biblioteca.persistencia.Archivo;
import biblioteca.persistencia.Exportar;
import biblioteca.persistencia.Importar;

import java.io.*;

/**
 * Created by francisco on 15/11/14.
 */
public class Biblioteca {

    private ListaCategoria listadoCategorias;
    private Categoria categoria;
    private String nombre;

    public Biblioteca(){
        this.nombre = "";
/*
        listadoCategorias = new ListaCategoria();
        categoria = new Categoria("Default");
        listadoCategorias.add(categoria);
*/
        listadoCategorias=Archivo.getDatos().getCategorias();
        
    }

    public void showMenu(){
        Menu menu = new Menu();

        MenuItem2 agregarCategoria = new MenuItem2(1,"Agregar Categoria",new CodigoItem() {
            @Override
            public boolean run() {
                System.out.print("Ingrese el nombre de la categoria: ");
                String nombreCat = Consola.readLine();
                categoria = new Categoria(nombreCat);
                listadoCategorias.add(categoria);
                return true;
            }
        });
        final MenuItem2 listarCategoria = new MenuItem2(2,"Listar Categorias",new CodigoItem() {
            @Override
            public boolean run() {

                for(Categoria c: listadoCategorias){
                    System.out.println(c);
                    for(Item i: c){
                        System.out.println(i);
                    }
                }

                return true;
            }
        });

        MenuItem2 salir = new MenuItem2(10,"Salir",new CodigoItem() {
            @Override
            public boolean run() {
                return false;
            }
        });

        MenuItem2 agregarItem = new MenuItem2(3,"Agregar nuevo item",new CodigoItem() {
            @Override
            public boolean run() {

                Menu menu=new Menu();

                MenuItem2 agregarLibro = new MenuItem2(1,"Agregar Libro",new CodigoItem() {
                    @Override
                    public boolean run() {

                        System.out.print("Ingrese el nombre del libro: ");
                        String nombre=Consola.readLine();
                        System.out.print("Ingrese el nombre del autor: ");
                        String autor=Consola.readLine();
                        System.out.print("Ingrese el nombre de la editorial: ");
                        String editorial=Consola.readLine();
                        Libro item = new Libro(nombre,autor,editorial);
                        item.agregarCategoria(listadoCategorias.get(0)); // Agregamos a la categoria por defecto
                        System.out.println("Ingrese la categoria del libro");
                        int op;
                        do {
                            int i = 0;
                            for (Categoria c : listadoCategorias) {
                                i++;
                                System.out.println(i + ". " + c.toString());
                            }
                            op=Consola.readInt();
                        }
                        while(!(op > 0 && op <= listadoCategorias.size()));
                        item.agregarCategoria(listadoCategorias.get(op-1));
                        return true;
                    }
                });

                MenuItem2 agregarRevista = new MenuItem2(2,"Agregar Revista",new CodigoItem() {
                    @Override
                    public boolean run() {

                        System.out.print("Ingrese el nombre de la revista: ");
                        String nombre=Consola.readLine();
                        System.out.print("Ingrese el nombre de la editorial: ");
                        String editorial=Consola.readLine();
                        Revista item = new Revista(nombre,editorial);
                        item.agregarCategoria(listadoCategorias.get(0)); // Agregamos a la categoria por defecto
                        System.out.println("Ingrese la categoria de la revista");
                        int op;
                        do {
                            int i = 0;
                            for (Categoria c : listadoCategorias) {
                                i++;
                                System.out.println(i + ". " + c.toString());
                            }
                            op=Consola.readInt();
                        }
                        while(!(op > 0 && op <= listadoCategorias.size()));
                        item.agregarCategoria(listadoCategorias.get(op-1));
                        return true;
                    }
                });

                MenuItem2 listarItem = new MenuItem2(3,"Listaro todos los item",new CodigoItem() {
                    @Override
                    public boolean run() {
                        for(Item i: listadoCategorias.get(0)) {
                            System.out.println(i);
                        }
                        return true;
                    }
                });
                MenuItem2 salir = new MenuItem2(9,"Salir",new CodigoItem() {
                    @Override
                    public boolean run() {
                        return false;
                    }
                });
                menu.addItem(agregarLibro);
                menu.addItem(agregarRevista);
                menu.addItem(listarItem);
                menu.addItem(salir);
                menu.showMenu();
                return true;
            }
        });
        MenuItem2 importar = new MenuItem2(7,"Importar datos",new CodigoItem() {
            @Override
            public boolean run() {

                System.out.print("Ingrese el nombre del archivo a importar: ");
                String filename;
                do {
                    filename = Consola.readLine();
                }while(filename.equals(""));
                //importar(filename);
                new Importar(filename);
                return true;
            }
        });
        MenuItem2 exportar = new MenuItem2(8,"exportar datos",new CodigoItem() {
            @Override
            public boolean run() {
                System.out.print("Ingrese el nombre del archivo a exportar: ");
                String filename;
                do {
                    filename = Consola.readLine();
                }while(filename.equals(""));
                //exportar(filename);
                new Exportar(filename);
                return true;
            }
        });
        
        MenuItem2 save = new MenuItem2(9,"save on disk",new CodigoItem() {
            @Override
            public boolean run() {
                Archivo.guardar();
                return true;
            }
        });
        


        menu.addItem(agregarCategoria);
        menu.addItem(listarCategoria);
        menu.addItem(agregarItem);
        menu.addItem(importar);
        menu.addItem(exportar);
        menu.addItem(save);
        menu.addItem(salir);
        menu.showMenu();

    }

}
