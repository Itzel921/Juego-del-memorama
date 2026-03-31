# Juego del Memorama (Java)

Juego de memorama hecho en **Java** usando **Swing/AWT (Java Graphics)**. Incluye un menú de inicio para elegir el modo de juego con **6**, **12** o **20** cartas.

**Autor:** Itzel Monroy

---

## Lenguajes utilizados

- **Java** (100%)

---

## Descripción del proyecto

Este proyecto implementa un juego de memorama con interfaz gráfica. Al iniciar, se muestra un menú donde puedes elegir el número de cartas:

- 6 cartas
- 12 cartas
- 20 cartas

Dependiendo de la selección, se abre la ventana correspondiente del juego.

---

## Estructura / Archivos del proyecto

### Archivos principales (UI / ventanas)
- `MenuInicio.java`  
  Punto de entrada del programa. Muestra un menú con opciones y abre el modo elegido.
- `GameFrame6Cartas.java`  
  Ventana del juego para el modo de 6 cartas.
- `GameFrame12Cartas.java`  
  Ventana del juego para el modo de 12 cartas.
- `GameFrame20Cartas.java`  
  Ventana del juego para el modo de 20 cartas.

### Lógica del juego
- `Logica6C.java`  
  Lógica para el modo de 6 cartas.
- `Logica12C.java`  
  Lógica para el modo de 12 cartas.
- `Logica20C.java`  
  Lógica para el modo de 20 cartas.

### Recursos (imágenes)
En la raíz del repositorio se incluyen imágenes que se usan como recursos del juego:
- `Imagen1.jpg` ... `Imagen10.jpg`
- `oso.jpg`

---

## ¿Cómo ejecutar el proyecto?

### Opción A: Desde un IDE (recomendado)
1. Abre el proyecto en **NetBeans**, **IntelliJ IDEA** o **Eclipse**.
2. Ejecuta la clase:
   - `MenuInicio.java` (tiene el método `main`).

Pasos generales:
1. Compila el proyecto.
2. Ejecuta la clase `Memoramass.MenuInicio`.

---

## ¿Cómo se juega?

1. Al iniciar, aparece un menú para seleccionar el modo: **6 / 12 / 20 cartas**.
2. Se abre la ventana del juego.
3. El objetivo es encontrar pares de cartas iguales con la menor cantidad de intentos/tiempo (según cómo esté implementado en la lógica del juego).

---

## Imágenes (capturas / recursos)

### Recursos del juego
![Imagen 1](assets/Imagen1.jpg)
![Imagen 2](assets/Imagen2.jpg)
...
![Imagen 10](assets/Imagen10.jpg)

![Oso](assets/oso.jpg)
