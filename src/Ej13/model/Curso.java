package Ej13.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private Integer cantidadHorasPorDia;
    private Integer cantidadDiasPorSemana;
    private String turno;
    public static final String TURNO_MANIANA = "turno_mañana";
    public static final String TURNO_TARDE = "turno_tarde";
    private Double precioPorHora;
    private List<String> studentNameList;
    private Scanner teclado;

    public Curso() {
        this.studentNameList = new ArrayList<>();
        this.teclado = new Scanner(System.in);
    }

    public Curso(String nombreCurso, Integer cantidadHorasPorDia, Integer cantidadDiasPorSemana, String turno, Double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.studentNameList = new ArrayList<>();
        this.teclado = new Scanner(System.in);
    }

    public void cargarAlumnos(){
        System.out.println("ingrese los nombres de 5 alumnos");
        for (int i = 0; i < 5; i++) {
            this.studentNameList.add(teclado.nextLine());
        }
        teclado.close();
    }

    public void crearCurso() throws Exception {
        System.out.println("ingrese el nombre del curso");
        this.nombreCurso = teclado.next();
        System.out.println("ingrese la cantidad de horas por dia");
        this.cantidadHorasPorDia = teclado.nextInt();
        System.out.println("ingrese los dias por semana");
        this.cantidadDiasPorSemana = teclado.nextInt();
        System.out.println("ingrese 'turno_mañana' o 'turno_mañana'");
        String turno = teclado.next();
        if(turno.equals(TURNO_MANIANA)){
            this.turno = TURNO_MANIANA;
        }else if(turno.equals(TURNO_TARDE)){
            this.turno = TURNO_TARDE;
        }else
            throw new Exception("turno mal ingresado");
        System.out.println("ingrese el precio por hora");
        this.precioPorHora = teclado.nextDouble();
        cargarAlumnos();
        teclado.close();
    }

    public Double calcularGanancias(){
        return precioPorHora*cantidadHorasPorDia*cantidadDiasPorSemana*studentNameList.size();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(Integer cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public Integer getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(Integer cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public List<String> getStudentNameList() {
        return studentNameList;
    }

    public void setStudentNameList(List<String> studentNameList) {
        this.studentNameList = studentNameList;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiasPorSemana=" + cantidadDiasPorSemana +
                ", turno='" + turno + '\'' +
                ", precioPorHora=" + precioPorHora +
                ", studentNameList=" + studentNameList +
                ", teclado=" + teclado +
                '}';
    }
}
