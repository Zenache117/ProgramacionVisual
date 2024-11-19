package com.DBConnection;

import com.Entidad.Producto;
import com.Entidad.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbConnection {

    Connection conexion = null;

    public void conectarBaseDatos() {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=ProyectoProgramacionVisual;user=ProgramacionUsuario;password=password;encrypt=false";

        try {

            conexion = DriverManager.getConnection(connectionUrl);
            System.out.println("\nConexión a SQL Server establecida.\n");

        } catch (SQLException e) {

            System.out.println("\nError al conectar con SQL Server.\n" + e.getMessage());

        }
    }

    public void registrarUsuario(String nombreUsuario, String contrasena) {

        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ?";

        try {

            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombreUsuario);
            java.sql.ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {

                System.out.println("\nEl usuario ya existe.\n");

            } else {

                query = "INSERT INTO Usuarios (nombre_usuario, contrasena) VALUES (?, ?)";
                statement = conexion.prepareStatement(query);
                statement.setString(1, nombreUsuario);
                statement.setString(2, contrasena);
                statement.executeUpdate();
                System.out.println("\nUsuario registrado con éxito.\n");

            }

        } catch (SQLException e) {

            System.out.println("\nError al registrar usuario.\n" + e.getMessage());

        }
    }

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {

        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";

        try {

            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombreUsuario);
            statement.setString(2, contrasena);
            java.sql.ResultSet resultado = statement.executeQuery();

            return resultado.next();

        } catch (SQLException e) {

            System.out.println("\nError al iniciar sesión.\n" + e.getMessage());
            return false;

        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public List<Producto> consultarProductos() {
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM productos";

        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            java.sql.ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setId(resultado.getInt("id_producto"));
                producto.setNombre(resultado.getString("nombre_producto"));
                producto.setImagen(resultado.getString("ubicacion_imagen"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }

        } catch (SQLException e) {
            System.out.println("\nError al consultar productos.\n" + e.getMessage());
        }

        return productos;
    }

    public List<Usuario> consultarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";

        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            java.sql.ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("id_usuario"));
                usuario.setNombre(resultado.getString("nombre_usuario"));
                usuario.setContraseña(resultado.getString("contrasena"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.out.println("\nError al consultar usuarios.\n" + e.getMessage());
        }

        return usuarios;
    }

    public void registrarProducto(String nombre, String ubicacionImg, double precio) throws SQLException {
        String query = "INSERT INTO productos (nombre_producto, ubicacion_imagen, precio) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, ubicacionImg);
            statement.setDouble(3, precio);
            statement.executeUpdate();
            System.out.println("Producto registrado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al registrar producto: " + e.getMessage());
            throw e; // Lanza la excepción para manejarla en el método anterior
        }
    }

}
