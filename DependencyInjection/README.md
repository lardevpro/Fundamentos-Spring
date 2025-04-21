# Inyección de Dependencias en Java

Este proyecto demuestra el concepto de Inyección de Dependencias (DI) en Java. La Inyección de Dependencias es un patrón de diseño utilizado para implementar IoC (Inversión de Control), permitiendo la creación de objetos dependientes fuera de una clase y proporcionando esos objetos a una clase de varias maneras.

## Estructura del Proyecto

El proyecto consta de las siguientes clases e interfaces:

1. **CreacionInformes**: Una interfaz que declara el método `getInforme()`.
2. **Empleados**: Una interfaz que declara los métodos `getTareas()` y `getInforme()`.
3. **Informe**: Una clase que implementa la interfaz `CreacionInformes`.
4. **DirectorEmpleado**: Una clase que implementa la interfaz `Empleados` y demuestra la inyección de dependencias mediante constructor.
5. **JefeEmpleado**: Una clase que implementa la interfaz `Empleados` y demuestra la inyección de dependencias mediante constructor.
6. **SecretarioEmpleado**: Una clase que implementa la interfaz `Empleados` y demuestra la inyección de dependencias mediante setter y la inyección de atributos.

## Explicación del Código

### Interfaz CreacionInformes

```java
package es.lardevpro.IoC;

public interface CreacionInformes {
    public String getInforme();
}