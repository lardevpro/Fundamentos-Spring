# Inyección de Dependencias con @Autowired en Spring

Este proyecto demuestra cómo utilizar la anotación `@Autowired` en Spring para la inyección de dependencias en atributos. La anotación `@Autowired` permite que Spring resuelva y inyecte los beans colaborativos en nuestra clase.

## Estructura del Proyecto

El proyecto consta de las siguientes clases e interfaces:

1. **CreacionInformeFinanciero**: Una interfaz que declara el método `getInformeFinanciero()`.
2. **Empleados**: Una interfaz que declara los métodos `getTareas()` y `getInforme()`.
3. **InformeFinancieroTrim1**: Una clase que implementa la interfaz `CreacionInformeFinanciero`.
4. **ComercialExperimentado**: Una clase que implementa la interfaz `Empleados` y utiliza la anotación `@Autowired` para la inyección de dependencias en un atributo.
5. **AppMain**: La clase principal que configura el contexto de Spring y utiliza los beans.

## Explicación del Código

### Interfaz CreacionInformeFinanciero

```java
package es.lardevpro.annotations;

/**
 * Interfaz para la creación de informes financieros.
 */
public interface CreacionInformeFinanciero {
    public String getInformeFinanciero();
}