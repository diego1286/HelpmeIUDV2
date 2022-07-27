package com.co.ed.iudigital.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// Se le dice que es autoincrementable a la llave primaria, se le pasa la estrategia de auto
    private  Long id;
    @Column(name = "username", length = 120, nullable = false, unique = true)
    private String userName;
    @Column(name = "nombre", length = 120, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 120, nullable = false)
    private String apellido;
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento; // como es de fecha se coloca localDte y se especifica en colunm name el monbre que es es el mismo de la bd


    //@Column(columnDefinition = "NULL DEFAULT 1")// Este campo define lo que se quiere hacer un tabla
    private  Boolean enabled ;
    // buscar que es enableb y column definition
    @Column(name = "red_social")
    private Boolean redSocial;
    /*
  image TEXT NULL DEFAULT 'https://happytravel.viajes/wp-content/uploads/2020/04/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png',
  */
    private String image;

    /*
    la anotacion prepersits por defecto pasa valores que se requieren si se encuentra nulo en el caso de la imagen de la bd pasamos la url para
    que se llene por defecto con esta imagen en caso de que el usuario la deje vacia  linea 54 este lo explica en la clase del 07/14/2022 julio
    diplomado web2022

     */
    @PrePersist
    public void persist() {
        if(enabled == null) {
            enabled = true;
        }
        if(redSocial == null) {
            redSocial = false;
        }
        if(image == null || "".equals(image)) {
            image = "https://happytravel.viajes/wp-content/uploads/2020/04/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png";
        }
    }


    @OneToMany
    @JoinColumn(name = "usuarios_id")
    private List<Delito> delitos;
    // relacion vidirecional con la tabla usuarios se mapea a la column de usuarios_id se llama vidireccional
    // a esta relacion por regla de negocio no es indispensable pero se hace por regla de negocio en este caso no es necesario


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "roles_usuarios",
            joinColumns = {
                    @JoinColumn(name = "usuarios_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "roles_id")
            })
    private List<Role> roles;
      // recibe una lista de roles para hacer la relacion
    //TODO: verificar lo de cascada en roles usuarios y en casos


    public List<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(List<Delito> delitos) {
        this.delitos = delitos;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(Boolean redSocial) {
        this.redSocial = redSocial;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
