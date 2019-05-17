package com.isil.apptextil.entidad;

public class trabajador {
    private  String codigo, nombre, apellido, categoria,msg;
    private int sueldo;

    public trabajador(String codigo, String nombre, String apellido, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        switch (categoria) {
            case "administracion":
                sueldo = 3500;
                break;
            case "produccion":
                sueldo = 4000;
                break;
            case "calidad":
                sueldo = 5000;
                break;
            case "gerencia":
                sueldo = 7500;
                break;
        }
    }


    public String MostrarInfo(){
        return  "************************"+
                "\nNombre: "+nombre+
                "\nApellido: "+apellido+
                "\nCodigo: "+codigo+
                "\nCategoria: "+categoria+
                "\nSueldo: "+sueldo+
                "\n***********************";

    }


}
